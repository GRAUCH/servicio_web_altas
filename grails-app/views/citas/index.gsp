<%--
  Created by IntelliJ IDEA.
  User: lolivera
  Date: 02/04/2020
  Time: 12:16
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'/>
    <meta http-equiv="X-UA-Compatible" content="IE = 11"/>
    <meta http-equiv="Cache-control" content="no-cache">
    <meta http-equiv="Expires" content="-1">
    <asset:stylesheet src="elementosCitas/core/main.css" rel="stylesheet"/>
    <asset:stylesheet src="elementosCitas/daygrid/main.css" rel="stylesheet"/>
    <asset:stylesheet src="elementosCitas/timegrid/main.css" rel="stylesheet"/>
    <asset:stylesheet src="elementosCitas/list/main.css" rel="stylesheet"/>
    <asset:stylesheet src="elementosCitas/core/main.css" rel="stylesheet"/>
    <asset:stylesheet src="elementosCitas/daygrid/main.css" rel="stylesheet"/>
    <asset:stylesheet src="elementosCitas/timegrid/main.css" rel="stylesheet"/>
    <asset:stylesheet src="elementosCitas/list/main.css" rel="stylesheet"/>
    <asset:stylesheet src="elementosCitas/toolTip/toolTip.css" rel="stylesheet"/>
    <asset:stylesheet src="bootstrap/bootstrap.css" rel="stylesheet"/>
    <!-- javascripts -->
    <asset:javascript src="elementosCitas/core/main.js"/>
    <asset:javascript src="elementosCitas/core/locales-all.js"/>
    <asset:javascript src="elementosCitas/core/locales/es.js"/>
    <asset:javascript src="elementosCitas/interaction/main.js"/>
    <asset:javascript src="elementosCitas/daygrid/main.js"/>
    <asset:javascript src="elementosCitas/timegrid/main.js"/>
    <asset:javascript src="elementosCitas/list/main.js"/>
    <asset:javascript src="jquery/jquery-1.9.1.js"/>
    <asset:javascript src="bootstrap.js"/>
    %{--LIBS AGREGADAS PARA EL TOOL TIP--}%
    <!-- <script src="https://unpkg.com/popper.js/dist/umd/popper.min.js"></script> -->
    <!-- <script src="https://unpkg.com/tooltip.js/dist/umd/tooltip.min.js"></script> -->
    <asset:javascript src="popper.min.js"/>
    <asset:javascript src="tooltip.min.js"/>
    %{--LIBS AGREGADAS PARA EL TOOL TIP--}%
    %{--Aqui termina full calendar--}%
    <asset:javascript src="calendar.js"/>



</head>

<body>
<g:render template="/comun/menu"/>
<g:form controller="citas" >
    <div style="align-items: center;
    display: flex;
    justify-content: center;
    margin-top: 20px;">

        <div id="top" style="width: 350px; ">
            <div style="float:left; padding-right: 20px;">
                <label for="pais_id" style="font-size:1.5em">Locales</label>
            </div>

            <div style="float:left;">
                <g:select class="form-control" style="max-width:95%;height: 35px;" optionKey="id" from="${paises}"
                          value="${pais.id}" name="pais_id" id="pais_id" onchange="submit(this.value)"
                          optionValue="nombre"></g:select>
            </div>

            <div id="refrescar">

                <g:actionSubmit value="Refrescar" class="fc-addEventButton-button fc-button fc-button-primary" action="index"/>


            </div>
        </div>
    </div>
    <g:if test="${flash.message}">
        <div class="message" role="status" style="text-align:center;color:red;font-size:1.5em">${flash.message}</div>
    </g:if>
</g:form>


<g:render template="modalNuevaCita" model="['configuraciones': configuraciones, 'companyas': companyas]"/>

%{--IMPLEMENTACION CALENDAR--}%
<div id='calendar'></div>
%{--FIN IMPLEMENTACION CALENDAR--}%





<g:hiddenField name="nuevacita" value="${createLink(controller: 'citas', action: 'nueva')}"/>
<g:hiddenField name="slots" id="slots" value="${slots[0].tiempoPorTurno}"/>
<g:hiddenField name="iniDate" id="iniDate" value="${slots[0].horaInicio}"/>
<g:hiddenField name="finDate" id="finDate" value="${slots[0].horaFin}"/>
<g:hiddenField name="configuracion" value="${createLink(controller: 'citas', action: 'index')}"/>
<g:hiddenField name="updateCitas" value="${createLink(controller: 'citas', action: 'list')}"/>
</body>

</html>


