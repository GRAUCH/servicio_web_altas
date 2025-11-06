<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="layout" content="main"/>
</head>

<body style="padding-top:0px;">
<g:render template="/comun/menu"/>
<div id="contenido" style="padding-top:100px;">
    <g:include view="${controllerName}/contenido.gsp"/>
</div>
</body>
</html>