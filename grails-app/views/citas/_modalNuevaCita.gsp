<!-- INICIO Modal nueva cita -->
<link rel="stylesheet" href="${resource(dir: 'css', file: 'jquery/jquery.datetimepicker.css')}"/>
<asset:javascript src="/jquery/jquery.datetimepicker.full.js"/>


<div class="modal fade" id="myModal" role="dialog">

    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Nueva Cita</h4>
            </div>

            <div class="modal-body">
                <div style="padding:0px 100px 20px 100px;">

                    <div class="fieldcontain">
                        <label for="inputConfig">Configuración</label>
                        <g:select class="form-control input-sm" id ="inputConfig" optionKey="id" from="${configuraciones}" name="config" optionValue="nombre"></g:select>
                    </div>

                    <div class="fieldcontain">
                        <label for="inputTitle">Titulo</label>
                        <g:textField name="title" id="inputTitle" class="form-control input-sm"/>
                    </div>

                    <div class="fieldcontain">
                        <label for="inputDescription">Descripción</label>
                        <g:textField name="description" id="inputDescription" class="form-control input-sm"/>
                    </div>

                    <div class="fieldcontain">
                        <label for="inputNumeroExpediente">Numero de Expediente</label>
                        <g:textField name="numeroExpediente" id="inputNumeroExpediente" class="form-control input-sm"/>
                    </div>

                    <div class="fieldcontain">
                        <label for="inputCompany">Compañia</label>
                        <g:select class="form-control input-sm" id ="inputCompany" optionKey="id" from="${companyas}" name="company" optionValue="name"></g:select>
                    </div>

                    <div class="fieldcontain">
                        <label for="inputStartTime">Hora de inicio</label>

                        <input type="text"
                               id="inputStartTime" name="startTime"
                               class="form-control input-sm datepicker " autocomplete="off"/>

                    </div>

                    <div class="fieldcontain">
                        <label for="inputEndTime">Hora de finalización</label>

                        <input type="text"
                               id="inputEndTime" name="endTime"
                               class="form-control input-sm datepicker " autocomplete="off"/>

                    </div>

                </div>

                <div class="modal-footer">
                    <button type="button" onclick="sendData(calendar)"
                            class="btn btn-default center-block">Crear</button>
                </div>
            </div>
        </div>

    </div>
</div>





<!--FIN  Modal nueva cita    -->