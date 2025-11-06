<legend
	style="font-size: 15px; font-weight: bold; border-bottom: none; margin-bottom: 0px;">Exclusiones</legend>
<!-- block -->
<div  style="border: 1px solid rgb(204, 204, 204);">

	<table aria-describedby="example_info" class="table dataTable"
		id="example">
		<thead>
			<tr role="row" style="background-color: rgb(206, 227, 246);">
				<th style="width: 1%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Código</th>
				<th style="width: 10%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Descripción</th>
				<th style="width: 5%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Garantia</th>
			</tr>
		</thead>
		<tbody aria-relevant="all" aria-live="polite" role="alert">

			<g:each in="${exclusiones}" var="exclusion" status="i">
				<tr class="\${(i % 2) == 0 ? 'gradeA even' : 'gradeA odd'}">
				<tr>
					<td style="font-size: 10px;">
						${exclusion?.codigoGarantia}
					</td>
					<td style="font-size: 10px;">
						${exclusion?.descripcion}
					</td>
					<td style="font-size: 10px;">
						${exclusion?.garantia}
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>
</div>
