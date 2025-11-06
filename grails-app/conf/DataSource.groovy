dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.postgresql.Driver"
    username = "postgres"
    password = "postgres"
}
hibernate {
    //jdbc.use_get_generated_keys = true
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    //    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
    localProIncidencias {
        println "Carga configuración datasource 'localProIncidencias'"
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            username = "postgres"
            password = "postgres"
            url = "jdbc:postgresql://localhost:5432/webaltascitas"
            driverClassName = "org.postgresql.Driver"
            dialect = "org.hibernate.dialect.PostgreSQLDialect"
            properties {
                // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
                jmxEnabled = true
                initialSize = 5
                maxActive = 50
                minIdle = 5
                maxIdle = 25
                maxWait = 10000
                maxAge = 10 * 60000
                timeBetweenEvictionRunsMillis = 5000
                minEvictableIdleTimeMillis = 60000
                validationQuery = "SELECT 1"
                validationQueryTimeout = 3
                validationInterval = 15000
                testOnBorrow = true
                testWhileIdle = true
                testOnReturn = false
                jdbcInterceptors = "ConnectionState"
                defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            }
        }
    }

    local {
        println "Carga configuración datasource 'local'"
        dataSource {
            //BD local
            dbCreate = "update" // one of 'create', 'create-drop','update'
            username = "postgres"
            password = "postgres"
            url = "jdbc:postgresql://localhost:5432/webaltascitas"
            driverClassName = "org.postgresql.Driver"
            dialect = "org.hibernate.dialect.PostgreSQLDialect"

/*
            //BD devloptment
            dbCreate = "update" // one of 'create', 'create-drop','update'
            username = "admintuw"
            password = "hwsol2015"
            url = "jdbc:postgresql://172.17.0.161:5432/webaltascitas"
            driverClassName = "org.postgresql.Driver"
            dialect = "org.hibernate.dialect.PostgreSQLDialect"
*/

            properties {
                // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
                jmxEnabled = true
                initialSize = 5
                maxActive = 50
                minIdle = 5
                maxIdle = 25
                maxWait = 10000
                maxAge = 10 * 60000
                timeBetweenEvictionRunsMillis = 5000
                minEvictableIdleTimeMillis = 60000
                validationQuery = "SELECT 1"
                validationQueryTimeout = 3
                validationInterval = 15000
                testOnBorrow = true
                testWhileIdle = true
                testOnReturn = false
                jdbcInterceptors = "ConnectionState"
                defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            }
        }
    }

    development {
        println "Carga configuración datasource 'development'"
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            jndiName = "java:jboss/datasources/ds_webaltascitas" //Es necesario crearlo en el wildfly
        }
    }

    integration {
        println "Carga configuración datasource 'integration'"
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            jndiName = "java:jboss/datasources/ds_webaltascitas" //Es necesario crearlo en el wildfly
        }
    }

    preproduction {
        println "Carga configuración datasource 'preproduction'"
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            jndiName = "java:jboss/datasources/ds_webaltascitas" //Es necesario crearlo en el wildfly
        }
    }

    production {
        println "Carga configuración datasource 'production'"
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            jndiName = "java:jboss/datasources/ds_webaltascitas" //Es necesario crearlo en el wildfly
        }
    }

    test {
        println "Carga configuración datasource 'test'"
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            jndiName = "java:jboss/datasources/ds_webaltascitas" //Es necesario crearlo en el wildfly
        }
    }
}
