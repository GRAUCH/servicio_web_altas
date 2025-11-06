var calendar;


document.addEventListener('DOMContentLoaded', function () {
    var ua = window.navigator.userAgent;
    var msie = ua.indexOf("MSIE ");


    if (msie > 0 || !!navigator.userAgent.match(/Trident.*rv\:11\./))  // If Internet Explorer, return version number
    {
        var x = document.getElementById("refrescar");
        x.style.display = "none";
        calendar = newCalendarIE();
        if (calendar != null) {
            var data = getPais(calendar);
            updateEvents(calendar, data);
        }
    } else {
        calendar = newCalendar();
    }


});

function newCalendar() {
    var initialLocaleCode = 'es';
    var calendarEl = document.getElementById('calendar');
    var pais = $('#pais_id').val();
    var duracion = '00:' + $('#slots').val();
    calendar = new FullCalendar.Calendar(calendarEl, {

        plugins: ['interaction', 'dayGrid', 'timeGrid', 'list'],
        header: {
            left: 'addEventButton,           prev,next',
            center: 'title',
            right: 'dayGridMonth,timeGridWeek,timeGridDay,listMonth'
        },
        defaultView: 'timeGridWeek',
        defaultDate: new Date(),
        customButtons: {
            addEventButton: {
                text: 'Agregar Cita',
                click: function () {
                    addApoimentRemotely();
                }
            }
        },

        locale: initialLocaleCode,
        buttonIcons: false, // show the prev/next text
        weekNumbers: true,
        eventBackgroundColor: '#4CAF50',
        minTime: $('#iniDate').val().split(" ")[1],
        maxTime: $('#finDate').val().split(" ")[1],
        navLinks: true, // can click day/week names to navigate views
        editable: false,
        eventLimit: true, // allow "more" link when too many events
        weekends: false,
        slotDuration: duracion,
        eventRender: function (info) {
            var tooltip = new Tooltip(info.el, {
                title: info.event.extendedProps.description,
                placement: 'top',
                trigger: 'hover',
                container: 'body'
            });
        },
        events: '/ServicioWebAltas/citas/list?pais=' + pais

    });

    calendar.render();
    return calendar
}

function newCalendarIE() {
    var initialLocaleCode = 'es';
    var calendarEl = document.getElementById('calendar');
    var pais = $('#pais_id').val();
    var duracion = '00:' + $('#slots').val();
    calendar = new FullCalendar.Calendar(calendarEl, {

        plugins: ['interaction', 'dayGrid', 'timeGrid', 'list'],
        header: {
            left: 'addEventButton refreshButton prevButton',
            center: 'title',
            right: 'nextButton monthButton,weekButton,agendaButton'
        },
        defaultView: 'timeGridWeek',
        defaultDate: new Date(),
        customButtons: {
            addEventButton: {
                text: 'Agregar Cita',
                click: function () {
                    addApoimentRemotely();
                }
            },
            refreshButton: {
                text: 'Refrescar',
                click: function () {
                    var data = getPais(calendar);
                    updateEvents(calendar, data);
                }
            },
            prevButton: {
                text: '<',
                click: function () {
                    var data = getPrev(calendar);
                    updateEvents(calendar, data);
                    calendar.prev();
                }
            },
            nextButton: {
                text: '>',
                click: function () {
                    var data = getNext(calendar);
                    updateEvents(calendar, data);
                    calendar.next();
                }
            },
            monthButton: {
                text: 'Mes',
                click: function () {
                    calendar.changeView("dayGridMonth");
                    var data = getPais(calendar);
                    updateEvents(calendar, data);
                }
            },
            weekButton: {
                text: 'Semana',
                click: function () {
                    calendar.changeView("timeGridWeek");
                    var data = getPais(calendar);
                    updateEvents(calendar, data);
                }
            },
            agendaButton: {
                text: 'Agenda',
                click: function () {
                    calendar.changeView("listMonth");
                    var data = getPais(calendar);
                    updateEvents(calendar, data);
                }
            }
        },

        locale: initialLocaleCode,
        buttonIcons: false, // show the prev/next text
        weekNumbers: true,
        eventBackgroundColor: '#4CAF50',
        minTime: $('#iniDate').val().split(" ")[1],
        maxTime: $('#finDate').val().split(" ")[1],
        navLinks: true, // can click day/week names to navigate views
        editable: false,
        eventLimit: true, // allow "more" link when too many events
        weekends: false,
        slotDuration: duracion,
        eventRender: function (info) {
            var tooltip = new Tooltip(info.el, {
                title: info.event.extendedProps.description,
                placement: 'top',
                trigger: 'hover',
                container: 'body'
            });
        }
    });

    calendar.render();
    return calendar
}

function addApoimentRemotely() {

    $('#myModal').modal('show');

}

function getPais(calendar) {
    var view = calendar.view;
    var start = view.activeStart;
    var end = view.activeEnd;
    var data = new FormData();
    var pais = $('#pais_id').val();
    data.append('pais', pais);
    data.append('start', start.toDateString());
    data.append('end', end.toDateString());
    return data;
}

function getPrev(calendar) {
    var view = calendar.view;
    var type = view.type;
    var button = "prev";
    var start = view.activeStart;
    var end = view.activeEnd;
    var data = new FormData();
    var pais = $('#pais_id').val();
    data.append('pais', pais);
    data.append('start', start.toDateString());
    data.append('end', end.toDateString());
    data.append('type', type);
    data.append('button', button);
    return data;
}

function getNext(calendar) {
    var view = calendar.view;
    var type = view.type;
    var button = "next";
    var start = view.activeStart;
    var end = view.activeEnd;
    var data = new FormData();
    var pais = $('#pais_id').val();
    data.append('pais', pais);
    data.append('start', start.toDateString());
    data.append('end', end.toDateString());
    data.append('type', type);
    data.append('button', button);
    return data;
}

function updateEvents(calendar, data) {

    $.ajax({
        data: data,
        contentType: false,
        processData: false,
        dataType: 'html',
        url: $('#updateCitas').val(),
        method: "POST",
        success: function (json) {
            var returnedData = JSON.parse(json);
            calendar.removeAllEvents();
            calendar.addEventSource(returnedData);
        },
        error: function (response) {
            if (response.responseText) {
                alert(response.responseText)
            }
        }
    });
}


function sendData(calendar) {
    if (false) {
        alert("El inicio de la cita debe ser anterior al de finalización");

    } else {

        var data = getData();
        $.ajax({
            data: data,
            contentType: false,
            processData: false,
            dataType: 'html',
            url: $('#nuevacita').val(),
            method: "POST",
            success: function (json) {
                var returnedData = JSON.parse(json);
                //response.text -> traemos el evento de vuelta.
                calendar.addEvent({
                    company: returnedData[0].company,
                    config: returnedData[0].config,
                    title: returnedData[0].title,
                    description: returnedData[0].description,
                    url: returnedData[0].url,
                    start: returnedData[0].start,
                    end: returnedData[0].end,
                    allDay: false
                });

                $('#myModal').on('hidden.bs.modal', function () {
                    $(this).find("input").val('').end();
                });
                $('#myModal').modal('hide');
            },
            error: function (response) {
                if (response.responseText) {
                    alert(response.responseText)

                }
            }
        });
    }
}

jQuery(document).ready(function () {
    'use strict';
    jQuery('#filter-date, #search-from-date, #search-to-date').datetimepicker();

});

$(function slot() {
    var times = getTimes()
    $(".datepicker").datetimepicker({
        format: 'd/m/Y H:i',
        allowTimes: times
    });
    $.datetimepicker.setLocale('es');

});

function getTimes() {
    var times = [];
    var slot = parseInt($('#slots').val());
    var iniDate = $('#iniDate').val().split(" ")[1];
    var finDate = $('#finDate').val().split(" ")[1];
    var division = 60 / slot;
    var horaIni = parseInt(iniDate.split(":")[0]);
    var horaFin = parseInt(finDate.split(":")[0]);

    for (var j = horaIni; j < horaFin; j++) {
        for (var i = 0; i < division; i++) {
            times.push(j + ":" + (slot * i))
        }
    }
    return times;
};


/**
 * Prints error messages given an array with error messages (no implmentado aún)
 */
function printErrorMessage(errorMessage) {
    errorMessage.forEach(function (error) {
        $('#calen').append('<span>' + error + '</span>');
    })
}

function getData() {
    var data = new FormData();
    data.append('company', $('#inputCompany').val());
    data.append('config', $('#inputConfig').val());
    data.append('title', $('#inputTitle').val());
    data.append('description', $('#inputDescription').val());
    data.append('numeroExpediente', $('#inputNumeroExpediente').val());
    data.append('startTime', $('#inputStartTime').val());
    data.append('endTime', $('#inputEndTime').val());
    return data;
}

function getCountry(pais) {
    var data = new FormData();
    data.append('pais_id', pais.value);
    return data;
}
