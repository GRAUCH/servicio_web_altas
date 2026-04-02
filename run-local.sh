#!/bin/bash

# --- CONFIGURACIÓN ---
DB_CONTAINER_NAME="postgres-local"
DB_NAME="webcitas_prepro_local"
DB_USER="postgres"
DB_PASS="postgres"
POSTGRES_IMAGE="postgres:12"

# --- ARRANQUE DEL CONTENEDOR ---
if [ "$(docker ps -q -f name=$DB_CONTAINER_NAME)" ]; then
  echo "🟢 PostgreSQL ya está corriendo."
elif [ "$(docker ps -aq -f status=exited -f name=$DB_CONTAINER_NAME)" ]; then
  echo "🔁 Reiniciando contenedor PostgreSQL..."
  docker start $DB_CONTAINER_NAME
else
  echo "🚀 Iniciando contenedor PostgreSQL..."
  docker run --name $DB_CONTAINER_NAME \
    -e POSTGRES_USER=$DB_USER \
    -e POSTGRES_PASSWORD=$DB_PASS \
    -e POSTGRES_DB=$DB_NAME \
    -p 5432:5432 \
    -d $POSTGRES_IMAGE
fi

# --- ESPERA REAL A POSTGRES ---
echo "⏳ Esperando a PostgreSQL..."
until docker exec $DB_CONTAINER_NAME psql -U $DB_USER -d $DB_NAME -c "SELECT 1" > /dev/null 2>&1; do
  sleep 2
done
echo "✅ PostgreSQL listo."

# --- OPCIONAL: LIMPIAR BD (solo si quieres empezar limpio) ---
# ⚠️ Esto borra TODO cada vez que arrancas
# Descomenta si lo necesitas

# echo "🧹 Limpiando base de datos..."
# docker exec -i $DB_CONTAINER_NAME psql -U $DB_USER -d $DB_NAME <<EOF
# DO \$\$
# DECLARE
#     stmt text;
# BEGIN
#     FOR stmt IN
#         SELECT 'TRUNCATE TABLE "' || tablename || '" RESTART IDENTITY CASCADE;'
#         FROM pg_tables
#         WHERE schemaname = 'public'
#     LOOP
#         EXECUTE stmt;
#     END LOOP;
# END
# \$\$;
# EOF
# echo "✅ Base de datos limpia."

# --- ARRANCAR GRAILS (BootStrap se encarga de todo) ---
echo "🚀 Arrancando aplicación Grails..."
grails run-app -Dgrails.env=local