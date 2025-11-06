<legend
	style="font-size: 15px; font-weight: bold; border-bottom: none; margin-bottom: 0px;">Garántias</legend>
<!-- block -->
<div  style="border: 1px solid rgb(204, 204, 204);">

	<table aria-describedby="example_info" class="table dataTable"
		id="example">
		<thead>
			<tr role="row" style="background-color: rgb(206, 227, 246);">
				<th style="text-align: center;width: 5%;font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Capital Cubierto</th>
				<th style="text-align: center;width: 5%;; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Concepto</th>
				<th style="text-align: center;width: 5%;font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Garantia</th>
				<th style="text-align: center;width: 5%;font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Descripción</th>
			</tr>
		</thead>

		<tbody aria-relevant="all" aria-live="polite" role="alert">

			<g:each in="${garantias}" var="garantia" status="i">
				<tr class="\${(i % 2) == 0 ? 'gradeA even' : 'gradeA odd'}">
				<tr>
					<td style="text-align: center;font-size: 10px;width: 10%">
						${garantia?.capitalCubierto}
					</td>
					<td style="text-align: center;font-size: 10px;width: 10%">
						${garantia?.codigoConcepto}
					</td>
					<td style="text-align: center;font-size: 10px;width: 10%">
						${garantia?.codigoGarantia}
					</td>
					<td style="text-align: center;font-size: 10px">
						${garantia?.descripcion}
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>
</div>
