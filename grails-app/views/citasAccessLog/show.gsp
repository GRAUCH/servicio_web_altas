<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />

    </head>
    <body>

        <div id="show-holding" class="content scaffold-show" role="main">
            <h1><g:message code="citas.show.title" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:display bean="citasAccessLog" />
        </div>
    </body>
</html>
