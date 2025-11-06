<%@ page import="org.joda.time.Instant" %>

<link rel="stylesheet" href="${resource(dir: 'css', file: 'jquery/jquery.datetimepicker.css')}"/>
<asset:javascript src="/jquery/jquery.datetimepicker.full.js"/>

<g:set var="entityName" value="${message(code: 'event.label', default: 'Event')}" />

<div class="fieldcontain ${hasErrors(bean: citaInstance, field: 'title', 'error')}">
    <label for="title"><g:message code="event.title.label" default="Title" /></label>
    <g:textField name="title" id="title" value="${citaInstance?.title}"/>
</div>
<div class="fieldcontain ${hasErrors(bean: citaInstance, field: 'description', 'error')}">
    <label for="description"><g:message code="event.description.label" default="Description" /></label>
    <g:textArea name="description" id = "description" value="${citaInstance?.description}" />
</div>

<div class="fieldcontain ${hasErrors(bean: citaInstance, field: 'company', 'error')}">
    <label for="company"><g:message code="event.location.label" default="Compañía" /></label>
    <g:textField name="company" id="company" value="${citaInstance?.company?.name}" readonly="true"/>
</div>
<div class="fieldcontain ${hasErrors(bean: citaInstance, field: 'numeroExpediente', 'error')}">
    <label for="numeroExpediente"><g:message code="event.location.label" default="Numero Expediente" /></label>
    <g:textField name="numeroExpediente" id="numeroExpediente" value="${citaInstance?.numeroExpediente}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: citaInstance, field: 'startTime', 'error')}">
    <label for="inputStartTime"><g:message code="event.startTime.label" default="Start Time" /></label>

    <input type="text"
           id="inputStartTime" name="startTime" value="${citaInstance?.startTime.format("dd/MM/yyyy HH:mm")}"
           class="form-control input-sm datepicker " autocomplete="off"/>

</div>


<div class="fieldcontain ${hasErrors(bean: citaInstance, field: 'endTime', 'error')}">
    <label for="inputEndTime"><g:message code="event.endTime.label" default="End Time" /></label>

    <input type="text"
           id="inputEndTime" name="endTime" value="${citaInstance?.endTime.format("dd/MM/yyyy HH:mm")}"
           class="form-control input-sm datepicker " autocomplete="off"/>

</div>






