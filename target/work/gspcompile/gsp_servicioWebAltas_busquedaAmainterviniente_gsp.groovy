import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_busquedaAmainterviniente_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/busquedaAma/interviniente.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( interviniente in (intervinientes) ) {
printHtmlPart(1)
expressionOut.print((i % 2) == 0 ? 'gradeA even' : 'gradeA odd')
printHtmlPart(2)
expressionOut.print(interviniente?.nombre)
printHtmlPart(3)
expressionOut.print(interviniente?.apellidos)
printHtmlPart(3)
expressionOut.print(interviniente?.numeroDocumento)
printHtmlPart(3)
expressionOut.print(interviniente?.estadoCivil)
printHtmlPart(3)
expressionOut.print(interviniente?.genero)
printHtmlPart(4)
expressionOut.print(interviniente?.direccion?.tipo)
printHtmlPart(5)
expressionOut.print(interviniente?.direccion?.lineaDireccion)
printHtmlPart(5)
expressionOut.print(interviniente?.direccion?.lineaDireccion2)
printHtmlPart(5)
expressionOut.print(interviniente?.direccion?.escalera)
printHtmlPart(5)
expressionOut.print(interviniente?.direccion?.numero)
printHtmlPart(5)
expressionOut.print(interviniente?.direccion?.provincia)
printHtmlPart(5)
expressionOut.print(interviniente?.direccion?.localidad)
printHtmlPart(5)
expressionOut.print(interviniente?.direccion?.codPostal)
printHtmlPart(6)
expressionOut.print(interviniente?.numeroMutualista)
printHtmlPart(7)
expressionOut.print(interviniente?.infoContacto.email)
printHtmlPart(5)
expressionOut.print(interviniente?.infoContacto?.telefonoFijo)
printHtmlPart(5)
expressionOut.print(interviniente?.infoContacto?.telefonoMovil)
printHtmlPart(4)
expressionOut.print(interviniente?.tipo)
printHtmlPart(4)
expressionOut.print(interviniente?.fechaNacimiento)
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
