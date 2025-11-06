import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_citasindexGeneral_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/citas/indexGeneral.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
invokeTag('stylesheet','asset',1,['src':("logo.css"),'rel':("stylesheet")],-1)
printHtmlPart(0)
invokeTag('image','asset',10,['src':("agente.png"),'style':("width:30px;")],-1)
printHtmlPart(1)
expressionOut.print(sec.loggedInUserInfo(field: 'fullname'))
printHtmlPart(2)
createClosureForHtmlPart(3, 1)
invokeTag('link','g',17,['class':("boton"),'controller':("busquedaAma"),'action':("index")],1)
printHtmlPart(4)
createClosureForHtmlPart(5, 1)
invokeTag('link','g',20,['class':("boton"),'controller':("busquedaNn"),'action':("index")],1)
printHtmlPart(4)
createClosureForHtmlPart(6, 1)
invokeTag('link','g',23,['class':("boton"),'controller':("citas"),'action':("index")],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',27,['class':("boton"),'controller':("citasAccessLog"),'action':("index")],2)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',28,['roles':("ROLE_ADMIN")],1)
printHtmlPart(10)
createClosureForHtmlPart(11, 1)
invokeTag('link','g',30,['class':("boton"),'controller':("logOut"),'action':("index")],1)
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
