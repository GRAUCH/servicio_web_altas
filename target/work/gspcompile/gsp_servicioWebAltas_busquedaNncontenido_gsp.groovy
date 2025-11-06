import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_busquedaNncontenido_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/busquedaNn/contenido.gsp" }
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
invokeTag('submitToRemote','g',41,['class':("btn btn-primary"),'oncomplete':("showSpinner(false)"),'onloading':("showSpinner(true)"),'update':("contenido"),'url':([controller:'busquedaNn', action:'buscar']),'value':("Buscar")],2)
printHtmlPart(4)
})
invokeTag('form','g',44,['class':("form-horizontal")],1)
printHtmlPart(5)
invokeTag('include','g',1,['view':("comun/footer.gsp")],-1)
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
