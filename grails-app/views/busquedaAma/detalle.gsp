<legend
	style="font-size: 15px; font-weight: bold; border-bottom: none; margin-bottom: 0px;">Detalle póliza ${detalle?.numeroPoliza}</legend>
<!-- block -->
<div id="detalle" style="border: 1px solid rgb(204, 204, 204);">

	<table aria-describedby="example_info" class="table dataTable"
		id="example">
		<thead>
			<tr role="row" style="background-color: rgb(206, 227, 246);">

				<th style="width: 15%;font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Ofi. Abridora</th>
				<th style="width: 5%;font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Ofi. Gestora</th>
				<th style="width: 5%;font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Indem. Diaria</th>									
				<th style="width: 5%;font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Profesión</th>
				<th style="width: 5%;font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Nº de cuenta</th>
				<th style="width: 15%;font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Titular</th>
				<th style="width: 5%;font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Estado</th>
				<th style="width: 5%;text-align: center;width: 5%;width: 80px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Antiguedad</th>
				<th style="width: 5%;text-align: center;width: 5%;width: 80px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Baja</th>
				<th style="width: 5%;text-align: center;width: 5%;width: 80px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Efecto</th>
				<th style="width: 5%;text-align: center;width: 5%;width: 80px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Inactividad</th>
				<th style="width: 5%;text-align: center;width: 5%;width: 80px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Vencimiento</th>
			</tr>
		</thead>

		<tbody aria-relevant="all" aria-live="polite" role="alert">
			<tr>
			
				<td style="font-size: 10px">
					${detalle?.codigoOficinaAbridora} ${detalle?.descripcionOficinaAbridora}
				</td>
				<td style="font-size: 10px">
					${detalle?.codigoOficinaGestora} ${detalle?.descripcionOficinaGestora}
				</td>
				<td style="font-size: 10px">
					${detalle?.indemnizacionDiaria} €
				</td>
				<td style="font-size: 10px">
					${detalle?.descripcionProfesion}
				</td>
				<td style="font-size: 10px">
					${detalle?.infoCuentaBancaria?.numeroCuenta}
				</td>
				<td style="font-size: 10px">
					${detalle?.infoCuentaBancaria?.titularCuenta}
				</td>
				<td style="font-size: 10px">
					${procedimientoTramitacion}
				</td>
				<td style="text-align: center;font-size: 10px">
					${detalle?.fechaAntiguedad}
				</td>
				<td style="text-align: center;font-size: 10px">
					${detalle?.fechaBaja}
				</td>
				<td style="text-align: center;font-size: 10px">
					${detalle?.fechaEfecto}
				</td>
				<td style="text-align: center;font-size: 10px">
					${detalle?.fechaInactividad}
				</td>
				<td style="text-align: center;font-size: 10px;width: 20px">
					${detalle?.fechaVencimiento}
				</td>
			</tr>
		</tbody>
	</table>
</div>
