import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_busquedaNnresultados_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/busquedaNn/resultados.gsp" }
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
createClosureForHtmlPart(3, 2)
invokeTag('submitToRemote','g',36,['class':("btn btn-primary"),'oncomplete':("showSpinner(false)"),'onloading':("showSpinner(true)"),'update':("contenido"),'url':([controller:'busquedaNn', action:'buscarDesdeResultado']),'value':("Buscar")],2)
printHtmlPart(4)
})
invokeTag('form','g',39,['class':("form-horizontal")],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('include','g',47,['view':("/busquedaNn/clientePolizas.gsp")],-1)
printHtmlPart(7)
if(true && (polizaSeleccionada)) {
printHtmlPart(8)
invokeTag('include','g',51,['view':("/busquedaNn/garantiasBeneficiarios.gsp")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
createClosureForHtmlPart(9, 2)
invokeTag('submitToRemote','g',60,['class':("btn"),'oncomplete':("showSpinner(false)"),'onloading':("showSpinner(true)"),'update':("contenido"),'url':([controller:'busquedaNn', action:'index']),'value':("Cancel")],2)
printHtmlPart(9)
createClosureForHtmlPart(9, 2)
invokeTag('submitToRemote','g',64,['class':("btn btn-primary"),'oncomplete':("showSpinner(false)"),'onloading':("showSpinner(true)"),'update':("contenido"),'url':([controller:'busquedaNn', action:'crear']),'value':("Crear expediente")],2)
printHtmlPart(11)
})
invokeTag('form','g',66,['class':("form-horizontal")],1)
printHtmlPart(12)
if(true && (expedienteCreado)) {
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
expressionOut.print(expedienteId)
printHtmlPart(15)
})
invokeTag('javascript','g',69,[:],2)
printHtmlPart(0)
}
printHtmlPart(16)
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
