Para correr el local
---------------------
- Primero tener grails 2.5.0 instalado y configurado
- Ejecutar el comando:
./run-local.sh  

Para empaquetar el proyecto
---------------------
- Ejecutar el comandos:
grails clean 
rm -rf target/
rm -rf build/
grails war -Dgrails.env=preproduction   