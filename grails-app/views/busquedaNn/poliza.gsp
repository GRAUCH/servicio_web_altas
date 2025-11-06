
<legend
	style="font-size: 15px; font-weight: bold; border-bottom: none; margin-bottom: 0px;">Datos
	póliza</legend>
<!-- block -->
<div style="border: 1px solid rgb(204, 204, 204);">

	<table aria-describedby="example_info" class="table dataTable"
		id="example">
		<thead>
			<tr role="row" style="background-color: rgb(206, 227, 246);">
				<th style="width: 0px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Garantias</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Póliza</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">DNI</th>
				<th style="width: 150px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Situación</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Compañía</th>
				<th style="width: 200px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Producto</th>
				<th style="width: 100px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Id.
					Póliza</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Efecto</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Pago</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Cobro</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Franquicia</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Renta</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Asegurado</th>
				<th style="width: 70px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Tomador
					1</th>
				<th style="width: 70px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Tomador
					2</th>
			</tr>
		</thead>

		<tbody aria-relevant="all" aria-live="polite" role="alert">

			<g:each in="${polizas}" var="poliza" status="i">
				<tr class="\${(i % 2) == 0 ? 'gradeA even' : 'gradeA odd'}">
				<tr>
					<td style="font-size: 10px;"><g:remoteLink update="datosPolizas"
							action="verGarantias" params="[poliza:poliza.numPoliza]">
							<asset:image src="info-icon.png" style="width: 20px;" />
						</g:remoteLink></td>
					<td style="font-size: 10px;">
						${poliza.numPoliza}
					</td>
					<td style="font-size: 10px;">
						${poliza.dni}
					</td>
					<td style="font-size: 10px;">
						${poliza.situacion} (${poliza.codSituacion})
					</td>
					<td style="font-size: 10px;">
						${poliza.company}
					</td>
					<td style="font-size: 10px;">
						${poliza.producto} (${poliza.codProducto})
					</td>
					<td style="font-size: 10px;">
						${poliza.polizaId}
					</td>
					<td style="font-size: 10px;"><g:formatDate format="dd/MM/yyyy"
							date="${poliza.fechaEfecto}" /></td>
					<td style="font-size: 10px;">
						${poliza.formaPago}
					</td>
					<td style="font-size: 10px;"><g:formatDate format="dd/MM/yyyy"
							date="${poliza.fechaVencimientoCobro}" /></td>
					<td style="font-size: 10px;">
						${poliza.diasFranquicia}
					</td>
					<td style="font-size: 10px;">
						${poliza.duracionRenta}
					</td>
					<td style="font-size: 10px;">
						${poliza.asegurado}
					</td>
					<td style="font-size: 10px;">
						${poliza.tomador1}
					</td>
					<td style="font-size: 10px;">
						${poliza.tomador2}
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>
</div>