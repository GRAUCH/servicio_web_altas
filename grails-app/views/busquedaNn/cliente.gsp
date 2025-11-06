<legend
	style="font-size: 15px; font-weight: bold; border-bottom: none; margin-bottom: 0px;">Datos
	candidato</legend>
<!-- block -->
<div style="border: 1px solid rgb(204, 204, 204);">


	<table aria-describedby="example_info" class="table dataTable"
		id="example">
		<thead>
			<tr role="row" style="background-color: rgb(206, 227, 246);">
				<th style="width: 200px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Nombre</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">DNI</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Cliente</th>
				<th style="width: 20px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Sexo</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Fijo</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Móvil</th>
				<th style="width: 100px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Profesión</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Nacimiento</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Aseg</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Tom1</th>
				<th style="width: 50px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Tom2</th>
				<th style="width: 150px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Dirección</th>
				<th style="width: 20px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Población</th>
				<th style="width: 100px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Provincia</th>
				<th style="width: 70px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">Cod.
					postal</th>
				<th style="width: 20px; font-size: 12px;" colspan="1" rowspan="1"
					aria-controls="example" tabindex="0" role="columnheader">País</th>
			</tr>
		</thead>

		<tbody aria-relevant="all" aria-live="polite" role="alert">

			<g:each in="${clientes}" var="cliente" status="i">
				<tr class="\${(i % 2) == 0 ? 'gradeA even' : 'gradeA odd'}">
				<tr>
					<td style="font-size: 10px;">
						${cliente.nombre} ${cliente.apellido1} ${cliente.apellido2}
					</td>
					<td style="font-size: 10px;">
						${cliente.dni}
					</td>
					<td style="font-size: 10px;">
						${cliente.codCliente}
					</td>
					<td style="font-size: 10px;">
						${cliente.sexo}
					</td>
					<td style="font-size: 10px;">
						${cliente.telFijo}
					</td>
					<td style="font-size: 10px;">
						${cliente.telMovil}
					</td>
					<td style="font-size: 10px;">
						${cliente.codProfesion}-${cliente.profesion}
					</td>
					<td style="font-size: 10px;"><g:formatDate format="dd/MM/yyyy"
							date="${cliente.fechaNacimiento}" /></td>
					<td style="font-size: 10px;">
						${cliente.asegurado}
					</td>
					<td style="font-size: 10px;">
						${cliente.tomador1}
					</td>
					<td style="font-size: 10px;">
						${cliente.tomador2}
					</td>
					<td style="font-size: 10px;">
						${cliente.tipoVia} ${cliente.direccion}
					</td>
					<td style="font-size: 10px;">
						${cliente.poblacion}
					</td>
					<td style="font-size: 10px;">
						${cliente.provincia}
					</td>
					<td style="font-size: 10px;">
						${cliente.codPostal}
					</td>
					<td style="font-size: 10px;">
						${cliente.pais}
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>
</div>