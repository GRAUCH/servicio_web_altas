import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_busquedaAmapoliza_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/busquedaAma/poliza.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( poliza in (polizas) ) {
printHtmlPart(1)
expressionOut.print((i % 2) == 0 ? 'gradeA even' : 'gradeA odd')
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('image','asset',56,['src':("info-icon.png"),'style':("width: 20px;")],-1)
printHtmlPart(4)
})
invokeTag('remoteLink','g',57,['update':("datosPolizas"),'action':("verPoliza"),'params':([cia:poliza?.codigoCompania, pais:poliza?.codigoPais, ramo:poliza?.codigoRamo,certificado:poliza?.numeroCertificado,poliza:poliza?.numeroPoliza,suplemento:poliza?.numeroSuplemento])],2)
printHtmlPart(5)
expressionOut.print(poliza?.codigoCompania)
printHtmlPart(6)
expressionOut.print(poliza?.codigoPais)
printHtmlPart(6)
expressionOut.print(poliza?.codigoRamo)
printHtmlPart(7)
expressionOut.print(poliza?.descripcionProducto)
printHtmlPart(7)
expressionOut.print(poliza?.descripcionRiesgo)
printHtmlPart(8)
expressionOut.print(poliza?.numeroCertificado)
printHtmlPart(8)
expressionOut.print(poliza?.numeroPoliza)
printHtmlPart(8)
expressionOut.print(poliza?.numeroSuplemento)
printHtmlPart(9)
i++
}
}
printHtmlPart(10)
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
