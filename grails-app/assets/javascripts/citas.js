function addCita(datosCita) {
    var index = add();
    $.ajax({
        url: $('#addCta').val(),
        method: "POST",
        data: {datosCita:datosCita},
        dataType: 'html',
        success: function (html) {
            $('#tarificationRows').append(html);
        }
    });
}