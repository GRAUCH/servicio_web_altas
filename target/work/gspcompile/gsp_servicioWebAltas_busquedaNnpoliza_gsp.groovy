import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_busquedaNnpoliza_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/busquedaNn/poliza.gsp" }
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
invokeTag('image','asset',55,['src':("info-icon.png"),'style':("width: 20px;")],-1)
printHtmlPart(4)
})
invokeTag('remoteLink','g',56,['update':("datosPolizas"),'action':("verGarantias"),'params':([poliza:poliza.numPoliza])],2)
printHtmlPart(5)
expressionOut.print(poliza.numPoliza)
printHtmlPart(6)
expressionOut.print(poliza.dni)
printHtmlPart(6)
expressionOut.print(poliza.situacion)
printHtmlPart(7)
expressionOut.print(poliza.codSituacion)
printHtmlPart(8)
expressionOut.print(poliza.company)
printHtmlPart(6)
expressionOut.print(poliza.producto)
printHtmlPart(7)
expressionOut.print(poliza.codProducto)
printHtmlPart(8)
expressionOut.print(poliza.polizaId)
printHtmlPart(9)
invokeTag('formatDate','g',76,['format':("dd/MM/yyyy"),'date':(poliza.fechaEfecto)],-1)
printHtmlPart(5)
expressionOut.print(poliza.formaPago)
printHtmlPart(9)
invokeTag('formatDate','g',81,['format':("dd/MM/yyyy"),'date':(poliza.fechaVencimientoCobro)],-1)
printHtmlPart(5)
expressionOut.print(poliza.diasFranquicia)
printHtmlPart(6)
expressionOut.print(poliza.duracionRenta)
printHtmlPart(6)
expressionOut.print(poliza.asegurado)
printHtmlPart(6)
expressionOut.print(poliza.tomador1)
printHtmlPart(6)
expressionOut.print(poliza.tomador2)
printHtmlPart(10)
i++
}
}
printHtmlPart(11)
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
