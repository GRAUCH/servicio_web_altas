<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="main"/>
    <title><g:message code="conf.list" default="Listado de Logs"/></title>
</head>

<body >
<br>

<div class="divCentrado">
    <div>
<g:render template="/comun/menu"/>

<div>
    <div  style="padding-top: 30px;">
    <g:if test="${flash.message}">
        <div class="message"><g:message code="${flash.message}" args="${flash.args}"
                                        default="${flash.defaultMessage}"/></div>
    </g:if>
    <div class="list">
        <table class="tftable">
            <thead>
            <tr>
                <g:sortableColumn property="action" title="Accion" titleKey="citasAccessLog.action"/>
                <g:sortableColumn property="ipAddress" title="Dirección IP" titleKey="citasAccessLog.ipAddress"/>
                <g:sortableColumn property="browser" title="Navegador" titleKey="citasAccessLog.browser"/>
                <g:sortableColumn property="operatingSystem" title="Sistema Operativo" titleKey="citasAccessLog.operatingSystem"/>
                <g:sortableColumn property="title" title="Titulo Cita" titleKey="citasAccessLog.title"/>
                <g:sortableColumn property="description" title="Descripción Cita" titleKey="citasAccessLog.description"/>
                <g:sortableColumn property="codigoST" title="Código ST" titleKey="citasAccessLog.codigoST"/>
                <g:sortableColumn property="createdDate" title="Fecha de operación" titleKey="citasAccessLog.createdDate"/>
                <g:sortableColumn property="fullName" title="Nombre del usuario" titleKey="citasAccessLog.fullName"/>
                <g:sortableColumn property="pais" title="Pais" titleKey="citasAccessLog.pais"/>
            </tr>
            </thead>
            <tbody>
            <g:each in="${citasAccessLogList}" status="i" var="citasAccessLogInstance">
                <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                    <td>${fieldValue(bean: citasAccessLogInstance, field: "action")}</td>
                    <td>${fieldValue(bean: citasAccessLogInstance, field: "ipAddress")}</td>
                    <td>${fieldValue(bean: citasAccessLogInstance, field: "browser")}</td>
                    <td>${fieldValue(bean: citasAccessLogInstance, field: "operatingSystem")}</td>
                    <td>${fieldValue(bean: citasAccessLogInstance, field: "title")}</td>
                    <td>${fieldValue(bean: citasAccessLogInstance, field: "description")}</td>
                    <td>${fieldValue(bean: citasAccessLogInstance, field: "codigoST")}</td>
                    <td>${fieldValue(bean: citasAccessLogInstance, field: "createdDate")}</td>
                    <td>${fieldValue(bean: citasAccessLogInstance, field: "fullName")}</td>
                    <td>${fieldValue(bean: citasAccessLogInstance, field: "pais")}</td>
                </tr>
            </g:each>
            </tbody>
        </table>
    </div>

    <div class="pagination">
        <g:paginate total="${citasAccessLogTotal}"/>
    </div>
    </div>
</div>
    </div>
</div>
</body>
</html>
