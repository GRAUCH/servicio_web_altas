<legend
	style="font-size: 15px; font-weight: bold; border-bottom: none; margin-bottom: 0px;">Intervinientes</legend>
<!-- block -->
<div style="border: 1px solid rgb(204, 204, 204);">

	<table aria-describedby="example_info" class="table dataTable"
		id="example">
		<thead>
			<tr role="row" style="background-color: rgb(206, 227, 246);">
				<th style="width: 5%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Nombre</th>
				<th style="width: 5%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Apellidos</th>
				<th style="width: 3%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Documento</th>
				<th style="width: 3%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Estado civil</th>
				<th style="width: 5%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Genero</th>
				<th style="text-align: center;width: 10%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Dirección</th>
				<th style="text-align: center;width: 5%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Mutualista</th>					
				<th style="width: 5%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Contacto</th>
				<th style="text-align: center;width: 5%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Tipo</th>
				<th style="text-align: center;width: 5%; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Fecha Nacimiento</th>
			</tr>
		</thead>

		<tbody aria-relevant="all" aria-live="polite" role="alert">

			<g:each in="${intervinientes}" var="interviniente" status="i">
				<tr class="\${(i % 2) == 0 ? 'gradeA even' : 'gradeA odd'}">
				<tr>
					<td style="font-size: 10px;">
						${interviniente?.nombre}
					</td>
					<td style="font-size: 10px;">
						${interviniente?.apellidos}
					</td>
					<td style="font-size: 10px;">
						${interviniente?.numeroDocumento}
					</td>
					<td style="font-size: 10px;">
						${interviniente?.estadoCivil}
					</td>
					<td style="font-size: 10px;">
						${interviniente?.genero}
					</td>
					<td style="text-align: center;font-size: 10px;">
						${interviniente?.direccion?.tipo} ${interviniente?.direccion?.lineaDireccion} ${interviniente?.direccion?.lineaDireccion2} ${interviniente?.direccion?.escalera} ${interviniente?.direccion?.numero} ${interviniente?.direccion?.provincia} ${interviniente?.direccion?.localidad} ${interviniente?.direccion?.codPostal} 
					</td>
					<td style="text-align: center;font-size: 10px;">
						${interviniente?.numeroMutualista}
					</td>				
					<td style="font-size: 10px;width: 10%">
						${interviniente?.infoContacto.email} ${interviniente?.infoContacto?.telefonoFijo} ${interviniente?.infoContacto?.telefonoMovil}
					</td>
					<td style="text-align: center;font-size: 10px;">
						${interviniente?.tipo}
					</td>
					<td style="text-align: center;font-size: 10px;">
						${interviniente?.fechaNacimiento}
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>
</div>
