
<legend
	style="font-size: 15px; font-weight: bold; border-bottom: none; margin-bottom: 0px;">Pólizas</legend>
<!-- block -->
<div style="border: 1px solid rgb(204, 204, 204);">

	<table aria-describedby="example_info" class="table dataTable"
		id="example">
		<thead>
			<tr role="row" style="background-color: rgb(206, 227, 246);">
				<th
					style="width: 5%; text-align: center; width: 0px; font-size: 12px;"
					colspan="1" rowspan="1" aria-controls="example" tabindex="0"
					role="columnheader">Garantias</th>
				<th
					style="width: 5%; text-align: center; width: 0px; font-size: 12px;"
					colspan="1" rowspan="1" aria-controls="example" tabindex="0"
					role="columnheader">Cia</th>
				<th
					style="width: 5%; text-align: center; width: 50px; font-size: 12px;"
					colspan="1" rowspan="1" aria-controls="example" tabindex="0"
					role="columnheader">País</th>
				<th
					style="width: 5%; text-align: center; width: 50px; font-size: 12px;"
					colspan="1" rowspan="1" aria-controls="example" tabindex="0"
					role="columnheader">Ramo</th>
				<th style="width: 5%; width: 270px; font-size: 12px;" colspan="1"
					rowspan="1" aria-controls="example" tabindex="0"
					role="columnheader">Producto</th>
				<th style="width: 5%; width: 110px; font-size: 12px;" colspan="1"
					rowspan="1" aria-controls="example" tabindex="0"
					role="columnheader">Asegurado</th>
				<th
					style="width: 5%; text-align: center; width: 50px; font-size: 12px;"
					colspan="1" rowspan="1" aria-controls="example" tabindex="0"
					role="columnheader">Certificado</th>
				<th
					style="width: 5%; text-align: center; width: 50px; font-size: 12px;"
					colspan="1" rowspan="1" aria-controls="example" tabindex="0"
					role="columnheader">Póliza</th>
				<th
					style="width: 5%; text-align: center; width: 50px; font-size: 12px;"
					colspan="1" rowspan="1" aria-controls="example" tabindex="0"
					role="columnheader">Suplemento</th>
		</thead>

		<tbody aria-relevant="all" aria-live="polite" role="alert">

			<g:each in="${polizas}" var="poliza" status="i">

				<tr class="\${(i % 2) == 0 ? 'gradeA even' : 'gradeA odd'}">
				<tr>
					<td style="font-size: 10px; text-align: center"><g:remoteLink
							update="datosPolizas" action="verPoliza"
							params="[cia:poliza?.codigoCompania, pais:poliza?.codigoPais, ramo:poliza?.codigoRamo,certificado:poliza?.numeroCertificado,poliza:poliza?.numeroPoliza,suplemento:poliza?.numeroSuplemento]">
							<asset:image src="info-icon.png" style="width: 20px;" />
						</g:remoteLink></td>
					<td style="font-size: 10px; text-align: center;">
						${poliza?.codigoCompania}
					</td>
					<td style="font-size: 10px; text-align: center;">
						${poliza?.codigoPais}
					</td>
					<td style="font-size: 10px; text-align: center;">
						${poliza?.codigoRamo}
					</td>
					<td style="font-size: 10px;">
						${poliza?.descripcionProducto}
					</td>
					<td style="font-size: 10px;">
						${poliza?.descripcionRiesgo}
					</td>
					<td style="text-align: center; font-size: 10px;">
						${poliza?.numeroCertificado}
					</td>
					<td style="text-align: center; font-size: 10px;">
						${poliza?.numeroPoliza}
					</td>
					<td style="text-align: center; font-size: 10px;">
						${poliza?.numeroSuplemento}
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>
</div>