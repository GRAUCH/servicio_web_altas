<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="layout" content="main"/>

</head>

<body style="padding-top:0px;">
<g:render template="/comun/menu"/>
<div id="index" style="padding-top:50px;">
    <g:include view="${controllerName}/contenido.gsp" params="[fecha:params.fecha]"/>
</div>
</body>
</html>