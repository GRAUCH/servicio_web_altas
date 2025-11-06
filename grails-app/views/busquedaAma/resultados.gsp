<g:include view="comun/spiner.gsp" />
<g:include view="comun/flashMessages.gsp" />
<div id="resultados" class="row-fluid">
	<div>
		<div class="block-content in">
			<div class="span12">
				<g:form class="form-horizontal">
					<fieldset>
						<g:include view="/busquedaAma/clientePolizas.gsp" />
						<div id="datosPolizas">
							<g:if test="${polizaSeleccionada}">
								<g:include view="/busquedaAma/detallePoliza.gsp" />
							</g:if>
						</div>
						<div style="padding-top: 1%;">
							<g:actionSubmit class="btn" action="index"  value="Nueva búsqueda"/>
							<g:submitToRemote class="btn btn-primary"
								oncomplete="showSpinner(false)" onloading="showSpinner(true)"
								update="contenido"
								url="[controller:'busquedaAma', action:'crear']"
								value="Crear expediente">
							</g:submitToRemote>
						</div>
					</fieldset>
				</g:form>
			</div>
		</div>
	</div>
</div>

<g:if test="${expedienteCreado}">
    <g:javascript>window.open("http://scor1-crm01/ScorTelemed/userdefined/edit.aspx?id=%7b${expedienteId}%7d&etc=10006",'_blank');</g:javascript>
</g:if>


