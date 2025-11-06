<g:include view="comun/spiner.gsp" />
<g:include view="comun/flashMessages.gsp" />
<div>
	<div class="span12" style="overflow: hidden; width: 100%;">
		<g:form class="form-horizontal">
			<fieldset>
				<legend
					style="font-size: 15px; font-weight: bold; border-bottom: none; margin-bottom: 0px;">Búsqueda</legend>
				<div class="control-group" style="width: 300px; float: left;">
					<label class="control-label" for="dni">DNI Asegurado </label>
					<div class="controls" style="width: 150px;">
						<input type="text" class="span6" style="width: 120px;" name="dni"
							id="dni">
					</div>
				</div>
				<div class="control-group" style="width: 300px; float: left;">
					<label class="control-label" for="producto">Cód. Producto </label>
					<div class="controls" style="width: 150px;">
						<input type="text" class="span6" style="width: 120px;"
							name="producto" id="producto">
					</div>
				</div>
				<div class="control-group" style="width: 300px; float: left;">
					<label class="control-label" for="poliza">Nº Póliza </label>
					<div class="controls" style="width: 150px;">
						<input type="text" class="span6" style="width: 120px;"
							name="poliza" id="poliza">
					</div>
				</div>
				<div>
					<g:submitToRemote class="btn btn-primary"
						oncomplete="showSpinner(false)" onloading="showSpinner(true)"
						update="contenido"
						url="[controller:'busquedaNn', action:'buscarDesdeResultado']"
						value="Buscar">
					</g:submitToRemote>
				</div>
			</fieldset>
		</g:form>
	</div>
</div>
<div class="row-fluid">
	<%--	<div class="block">--%>
	<div>
		<%--		<div class="navbar navbar-inner block-header">--%>
		<%--			<div class="muted pull-left">Formulario de resultados</div>--%>
		<%--		</div>--%>
		<%--		<div class="block-content collapse in">--%>
		<div class="block-content in">
			<div class="span12">
				<g:form class="form-horizontal">
					<fieldset>
						<g:include view="/busquedaNn/clientePolizas.gsp" />
						<div id="datosPolizas">
							<g:if test="${polizaSeleccionada}">
								<g:include view="/busquedaNn/garantiasBeneficiarios.gsp" />
							</g:if>
						</div>

						<%--						<div class="form-actions" style="padding-left: 1%;">--%>
						<div style="padding-top: 1%;">
							<g:submitToRemote class="btn" oncomplete="showSpinner(false)"
								onloading="showSpinner(true)" update="contenido"
								url="[controller:'busquedaNn', action:'index']" value="Cancel">
							</g:submitToRemote>
							<g:submitToRemote class="btn btn-primary"
								oncomplete="showSpinner(false)" 
								onloading="showSpinner(true)" update="contenido" 
								url="[controller:'busquedaNn', action:'crear']"
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
    <g:javascript>window.open('${expedienteId}','_blank');</g:javascript>
</g:if>

