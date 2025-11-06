# Servicios Web Altas

## 1. Compilation notes
### 1.1 Delete gson 2.2.4 library
We should follow the following steps to delete the gson library:
- We go to the path C:\gitWebHighWebService-1.6.0.war\WEB-INF\lib inside the war and we delete the jar gson 2.2.4
- We must delete the next part "WEB-INF/lib/gson-2.10.1.jar,"
 inside the war in the file  META-INF/MANIFEST.MF

If the gson 2.2.4 library has not been removed, the following error occurs.
You can see this error in the /var/log/wildfly/server.log file.

```
2023-03-07 11:31:40,867 INFO  [stdout] (default task-25) 2023-03-07 11:31:40,866 [default task-25] ERROR errors.GrailsExceptionResolver  - NoSuchMethodError occurred when processing request: [POST] /ServicioWebAltas/busquedaNn/buscar
2023-03-07 11:31:40,867 INFO  [stdout] (default task-25) com.google.gson.reflect.TypeToken.getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;. Stacktrace follows:
2023-03-07 11:31:40,867 INFO  [stdout] (default task-25) org.codehaus.groovy.grails.web.servlet.mvc.exceptions.ControllerExecutionException: Executing action [buscar] of controller [serviciowebaltas.BusquedaNnController]  caused exception: Runtime error executing action
```