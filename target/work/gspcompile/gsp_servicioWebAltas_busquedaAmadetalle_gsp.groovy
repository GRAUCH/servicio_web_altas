import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_busquedaAmadetalle_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/busquedaAma/detalle.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(detalle?.numeroPoliza)
printHtmlPart(1)
expressionOut.print(detalle?.codigoOficinaAbridora)
printHtmlPart(2)
expressionOut.print(detalle?.descripcionOficinaAbridora)
printHtmlPart(3)
expressionOut.print(detalle?.codigoOficinaGestora)
printHtmlPart(2)
expressionOut.print(detalle?.descripcionOficinaGestora)
printHtmlPart(3)
expressionOut.print(detalle?.indemnizacionDiaria)
printHtmlPart(4)
expressionOut.print(detalle?.descripcionProfesion)
printHtmlPart(3)
expressionOut.print(detalle?.infoCuentaBancaria?.numeroCuenta)
printHtmlPart(3)
expressionOut.print(detalle?.infoCuentaBancaria?.titularCuenta)
printHtmlPart(3)
expressionOut.print(procedimientoTramitacion)
printHtmlPart(5)
expressionOut.print(detalle?.fechaAntiguedad)
printHtmlPart(5)
expressionOut.print(detalle?.fechaBaja)
printHtmlPart(5)
expressionOut.print(detalle?.fechaEfecto)
printHtmlPart(5)
expressionOut.print(detalle?.fechaInactividad)
printHtmlPart(6)
expressionOut.print(detalle?.fechaVencimiento)
printHtmlPart(7)
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
