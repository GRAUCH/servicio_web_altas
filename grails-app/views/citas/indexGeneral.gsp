<asset:stylesheet src="logo.css" rel="stylesheet"/>

<div>
    <div class="divCentrado">
        <div>
            <div style="padding-bottom: 20px;">
                <a role="button" style="font-size: 15;
                font-family: arial;"
                   class="dropdown-toggle" data-toggle="dropdown"><asset:image
                        src="agente.png" style="width:30px;"/> ${sec.loggedInUserInfo(field: 'fullname')}
                </a>
                <hr style="border: 0.1px solid #666666;">
            </div>

            <div class="nav-collapse collapse">

                <g:link class="boton" controller="busquedaAma" action="index">Busqueda AMA</g:link>


                <g:link class="boton" controller="busquedaNn" action="index">Busqueda NN</g:link>


                <g:link class="boton" controller="citas" action="index">Citas</g:link>


                <sec:ifAnyGranted roles="ROLE_ADMIN">
                    <g:link class="boton" controller="citasAccessLog" action="index">Logs</a></g:link>
                </sec:ifAnyGranted>

                <g:link class="boton" controller="logOut" action="index">Logout</g:link>

            </div>
        </div>
    </div>
</div>