import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_busquedaAmaresultados_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/busquedaAma/resultados.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
invokeTag('include','g',1,['view':("comun/spiner.gsp")],-1)
printHtmlPart(0)
invokeTag('include','g',2,['view':("comun/flashMessages.gsp")],-1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('include','g',9,['view':("/busquedaAma/clientePolizas.gsp")],-1)
printHtmlPart(3)
if(true && (polizaSeleccionada)) {
printHtmlPart(4)
invokeTag('include','g',12,['view':("/busquedaAma/detallePoliza.gsp")],-1)
printHtmlPart(5)
}
printHtmlPart(6)
invokeTag('actionSubmit','g',16,['class':("btn"),'action':("index"),'value':("Nueva búsqueda")],-1)
printHtmlPart(5)
createClosureForHtmlPart(5, 2)
invokeTag('submitToRemote','g',22,['class':("btn btn-primary"),'oncomplete':("showSpinner(false)"),'onloading':("showSpinner(true)"),'update':("contenido"),'url':([controller:'busquedaAma', action:'crear']),'value':("Crear expediente")],2)
printHtmlPart(7)
})
invokeTag('form','g',25,['class':("form-horizontal")],1)
printHtmlPart(8)
if(true && (expedienteCreado)) {
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
expressionOut.print(expedienteId)
printHtmlPart(11)
})
invokeTag('javascript','g',32,[:],2)
printHtmlPart(0)
}
printHtmlPart(12)
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
