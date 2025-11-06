
<legend
	style="font-size: 15px; font-weight: bold; border-bottom: none; margin-bottom: 0px;">Siniestros</legend>
<!-- block -->
<div style="border: 1px solid rgb(204, 204, 204);">


	<table aria-describedby="example_info" class="table dataTable"
		id="example">
		<thead>
			<tr role="row" style="background-color: rgb(206, 227, 246);">
				<th style="width: 50; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Siniestro</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Póliza</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Company</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Producto</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Tipo</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Causa</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Ocurrencia</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Terminación</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Estado</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Minusvalia</th>
			</tr>
		</thead>

		<tbody aria-relevant="all" aria-live="polite" role="alert">

			<g:each in="${siniestros}" var="siniestro" status="i">
				<tr class="\${(i % 2) == 0 ? 'gradeA even' : 'gradeA odd'}">
				<tr>
					<td style="font-size: 10px;">
						${siniestro.numSiniestro}
					</td>
					<td style="font-size: 10px;">
						${siniestro.numPoliza}
					</td>
					<td style="font-size: 10px;">
						${siniestro.company}
					</td>
					<td style="font-size: 10px;">
						${siniestro.producto}
					</td>
					<td style="font-size: 10px;">
						${siniestro.tipo}
					</td>
					<td style="font-size: 10px;">
						${siniestro.causa}
					</td>
					<td style="font-size: 10px;"><g:formatDate format="dd/MM/yyyy"
							date="${siniestro.fechaOcurrencia}" /></td>
					<td style="font-size: 10px;"><g:formatDate format="dd/MM/yyyy"
							date="${siniestro.fechaTerminacion}" /></td>
					<td style="font-size: 10px;">
						${siniestro.estado}
					</td>
					<td style="font-size: 10px;">
						${siniestro.minusvalia}
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>
</div>


