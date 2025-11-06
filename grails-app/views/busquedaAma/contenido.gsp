<g:include view="comun/spiner.gsp" />
<g:include view="comun/flashMessages.gsp" />
<div id = "contenido" class="row-fluid" style="padding-top: 1%;">
	<div class="block" style="margin: 0em 0em;">
		<div class="navbar navbar-inner block-header">
			<div class="muted pull-left">Formulario de búsqueda</div>
		</div>
		<img alt="ama" src="/ServicioWebAltas/assets/logo/ama.png" style="width: 10%; float: right; padding: 10px 10px 10px 10px;">
		<div class="block-content collapse in">
			<div class="span12">
				<g:form class="form-horizontal">
					<fieldset>					
						<legend>Búsqueda</legend>
						<div>
							<div class="control-group" style="width: 30%; float: left;">
								<div class="control-group">
									<label class="control-label" for="cia"
										style="text-align: left;">Cód. Compañia </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 30%;"
											name="cia" id="cia" value="${params.cia}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="poliza"
										style="text-align: left;">Núm. Póliza </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 70%;"
											name="poliza" id="poliza" value="${params.poliza}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="suplemento"
										style="text-align: left;">Núm. Suplemento </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 70%;"
											name="suplemento" id="suplemento" value="${params.suplemento}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="pais"
										style="text-align: left;">Cód. País </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 30%;"
											name="pais" id="pais" value="${params.pais}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="ramo"
										style="text-align: left;">Cód. Ramo </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 30%;"
											name="ramo" id="ramo" value="${params.ramo}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="certificado"
										style="text-align: left;">Num. Certificado </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 70%;"
											name="certificado" id="certificado" value="${params.certificado}">
									</div>
								</div>
							</div>
							<div class="control-group" style="width: 30%; float: left;">
								<div class="control-group">
									<label class="control-label" for="apellidos"
										style="text-align: left;">Apellidos </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 100%;"
											name="apellidos" id="apellidos" value="${params.apellidos}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="nombre"
										style="text-align: left;">Nombre </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 100%;"
											name="nombre" id="nombre" value="${params.nombre}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="documento"
										style="text-align: left;">Núm. Documento </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 40%;"
											name="documento" id="documento" value="${params.documento}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="mutualista"
										style="text-align: left;">Núm. Mutualista </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 40%;"
											name="mutualista" id="mutualista" value="${params.mutualista}">
									</div>
								</div>
									<div class="control-group">
									<label class="control-label" for="fecha"
										style="text-align: left;">Fecha </label>
									<div class="controls">
										<input type="text" class="span6" style="width: 40%;"
											name="fecha" id="fecha" value="${params.fecha}">
									</div>
								</div>
							</div>
						</div>
						<div class="form-actions" style="clear: both; padding-left: 10px;">
							<g:submitToRemote class="btn btn-primary"
								oncomplete="showSpinner(false)" onloading="showSpinner(true)"
								update="contenido"
								url="[controller:'busquedaAma', action:'buscar']" value="Buscar">
							</g:submitToRemote>
						</div>
					</fieldset>
				</g:form>
			</div>
		</div>
	</div>
</div>
<g:include view="comun/footer.gsp" />