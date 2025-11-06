
<legend style="font-size: 15px;font-weight:bold;border-bottom: none;margin-bottom: 0px;">Beneficiarios póliza</legend>
<!-- block -->
<div style="border: 1px solid rgb(204, 204, 204);">


	<table aria-describedby="example_info" class="table dataTable"
		id="example">
		<thead>
			<tr role="row" style="background-color: rgb(206, 227, 246);">
				<th style="width: 50; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Póliza</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Código</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Descripcion</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Orden</th>
			</tr>
		</thead>

		<tbody aria-relevant="all" aria-live="polite" role="alert">

			<g:each in="${beneficiarios}" var="beneficiario" status="i">
				<tr class="\${(i % 2) == 0 ? 'gradeA even' : 'gradeA odd'}">
				<tr>
					<td style="font-size: 10px;">
						${beneficiario.numPoliza}
					</td>
					<td style="font-size: 10px;">
						${beneficiario.codigo}
					</td>
					<td style="font-size: 10px;">
						${beneficiario.descripcion}
					</td>
					<td style="font-size: 10px;">
						${beneficiario.orden}
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>
</div>


