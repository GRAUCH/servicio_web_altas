<%@ page import="org.joda.time.Instant" %>

<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>
    <meta charset='utf-8'/>
    <meta http-equiv="X-UA-Compatible" content="IE = 11" />
</head>

<body>
<br>
<br>
<br>

<div class="nav" role="navigation">
    <br>
    <g:link controller="citas" action="index"
            class="calendar">${message(code: 'calendar.show.menu', default: 'Volver al calendario')}</g:link>

</div>

<div id="show-event" class="content scaffold-show" role="main">
    <h1>${citaInstance?.title}</h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <g:form>
    %{--<div style="background: yellow;--}%

    %{--/*IMPORTANTE*/--}%
    %{--display: flex;--}%
    %{--justify-content: center;--}%
    %{--align-items: center;">--}%
    %{--<div style="background: red; padding:30px;">--}%
        <fieldset class="form">
            <g:render template="form" model="[citaInstance: citaInstance]"/>
        </fieldset>

        <fieldset class="buttons">
            <g:hiddenField name="id" value="${citaInstance?.id}"/>
            <g:hiddenField name="slots" id="slots" value="${slots[0].tiempoPorTurno}"/>
            <g:hiddenField name="iniDate" id="iniDate" value="${slots[0].horaInicio}"/>
            <g:hiddenField name="finDate" id="finDate" value="${slots[0].horaFin}"/>
            <g:actionSubmit class="save" action="update"
                            value="${message(code: 'default.button.update.label', default: 'Update')}"/>
            <g:actionSubmit class="delete" action="delete"
                            value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                            formnovalidate="" onclick="return confirm('¿Está segura de que desea eliminar la cita?')"/>

        </fieldset>
    %{--</div>--}%
    %{--</div>--}%
    </g:form>

</div>
</body>
</html>
