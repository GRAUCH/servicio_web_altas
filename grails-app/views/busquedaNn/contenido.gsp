<g:include view="comun/spiner.gsp" />
<g:include view="comun/flashMessages.gsp" />
<div class="row-fluid">
	<div class="block" style="margin: 0em 0em;">
		<div class="navbar navbar-inner block-header">
			<div class="muted pull-left">Formulario de búsqueda</div>
		</div>
		<img alt="nn" src="/ServicioWebAltas/assets/logo/nn.png" style="width: 10%; float: right; padding: 10px 10px 10px 10px;">
		<div class="block-content collapse in">
			<div class="span12">
				<g:form class="form-horizontal">
					<fieldset>
						<legend>Búsqueda</legend>
						<div class="control-group">
							<label class="control-label" for="dni" style="text-align: left;">DNI Asegurado </label>
							<div class="controls">
								<input type="text" class="span6" style="width: 10%;" name="dni"
									id="dni">
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="producto" style="text-align: left;">Cód. Producto
							</label>
							<div class="controls">
								<input type="text" class="span6" style="width: 10%;" name="producto"
									id="producto">
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="poliza" style="text-align: left;">Nº Póliza </label>
							<div class="controls">
								<input type="text" class="span6" style="width: 10%;" name="poliza"
									id="poliza">
							</div>
						</div>
						<div class="form-actions" style="padding-left: 10px;">
							<g:submitToRemote class="btn btn-primary"
								oncomplete="showSpinner(false)" onloading="showSpinner(true)"
								update="contenido" url="[controller:'busquedaNn', action:'buscar']"
								value="Buscar">
							</g:submitToRemote>
						</div>
					</fieldset>
				</g:form>
			</div>
		</div>
	</div>
</div>
<g:include view="comun/footer.gsp" />