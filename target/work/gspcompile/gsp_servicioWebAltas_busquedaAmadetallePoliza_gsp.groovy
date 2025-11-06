import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_busquedaAmadetallePoliza_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/busquedaAma/detallePoliza.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
invokeTag('include','g',1,['view':("/busquedaAma/detalle.gsp")],-1)
printHtmlPart(0)
if(true && (!exclusiones.isEmpty())) {
printHtmlPart(1)
invokeTag('include','g',3,['view':("/busquedaAma/exclusion.gsp")],-1)
printHtmlPart(0)
}
printHtmlPart(0)
invokeTag('include','g',5,['view':("/busquedaAma/garantia.gsp")],-1)
printHtmlPart(0)
invokeTag('include','g',1,['view':("/busquedaAma/interviniente.gsp")],-1)
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
