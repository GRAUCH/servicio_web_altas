<g:include view="/busquedaAma/detalle.gsp" />
<g:if test="${!exclusiones.isEmpty()}">
     <g:include view="/busquedaAma/exclusion.gsp" />
</g:if>
<g:include view="/busquedaAma/garantia.gsp" />
<g:include view="/busquedaAma/interviniente.gsp" />