import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_busquedaNncliente_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/busquedaNn/cliente.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( cliente in (clientes) ) {
printHtmlPart(1)
expressionOut.print((i % 2) == 0 ? 'gradeA even' : 'gradeA odd')
printHtmlPart(2)
expressionOut.print(cliente.nombre)
printHtmlPart(3)
expressionOut.print(cliente.apellido1)
printHtmlPart(3)
expressionOut.print(cliente.apellido2)
printHtmlPart(4)
expressionOut.print(cliente.dni)
printHtmlPart(4)
expressionOut.print(cliente.codCliente)
printHtmlPart(4)
expressionOut.print(cliente.sexo)
printHtmlPart(4)
expressionOut.print(cliente.telFijo)
printHtmlPart(4)
expressionOut.print(cliente.telMovil)
printHtmlPart(4)
expressionOut.print(cliente.codProfesion)
printHtmlPart(5)
expressionOut.print(cliente.profesion)
printHtmlPart(6)
invokeTag('formatDate','g',75,['format':("dd/MM/yyyy"),'date':(cliente.fechaNacimiento)],-1)
printHtmlPart(7)
expressionOut.print(cliente.asegurado)
printHtmlPart(4)
expressionOut.print(cliente.tomador1)
printHtmlPart(4)
expressionOut.print(cliente.tomador2)
printHtmlPart(4)
expressionOut.print(cliente.tipoVia)
printHtmlPart(3)
expressionOut.print(cliente.direccion)
printHtmlPart(4)
expressionOut.print(cliente.poblacion)
printHtmlPart(4)
expressionOut.print(cliente.provincia)
printHtmlPart(4)
expressionOut.print(cliente.codPostal)
printHtmlPart(4)
expressionOut.print(cliente.pais)
printHtmlPart(8)
i++
}
}
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1733850596000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
