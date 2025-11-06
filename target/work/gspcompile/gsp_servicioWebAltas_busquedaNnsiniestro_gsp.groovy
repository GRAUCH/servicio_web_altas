import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_busquedaNnsiniestro_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/busquedaNn/siniestro.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( siniestro in (siniestros) ) {
printHtmlPart(1)
expressionOut.print((i % 2) == 0 ? 'gradeA even' : 'gradeA odd')
printHtmlPart(2)
expressionOut.print(siniestro.numSiniestro)
printHtmlPart(3)
expressionOut.print(siniestro.numPoliza)
printHtmlPart(3)
expressionOut.print(siniestro.company)
printHtmlPart(3)
expressionOut.print(siniestro.producto)
printHtmlPart(3)
expressionOut.print(siniestro.tipo)
printHtmlPart(3)
expressionOut.print(siniestro.causa)
printHtmlPart(4)
invokeTag('formatDate','g',59,['format':("dd/MM/yyyy"),'date':(siniestro.fechaOcurrencia)],-1)
printHtmlPart(5)
invokeTag('formatDate','g',61,['format':("dd/MM/yyyy"),'date':(siniestro.fechaTerminacion)],-1)
printHtmlPart(6)
expressionOut.print(siniestro.estado)
printHtmlPart(3)
expressionOut.print(siniestro.minusvalia)
printHtmlPart(7)
i++
}
}
printHtmlPart(8)
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
