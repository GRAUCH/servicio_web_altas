import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_citasAccessLogindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/citasAccessLog/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',5,['code':("conf.list"),'default':("Listado de Logs")],-1)
})
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',13,['template':("/comun/menu")],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
invokeTag('message','g',19,['code':(flash.message),'args':(flash.args),'default':(flash.defaultMessage)],-1)
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('sortableColumn','g',25,['property':("action"),'title':("Accion"),'titleKey':("citasAccessLog.action")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',26,['property':("ipAddress"),'title':("Dirección IP"),'titleKey':("citasAccessLog.ipAddress")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',27,['property':("browser"),'title':("Navegador"),'titleKey':("citasAccessLog.browser")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',28,['property':("operatingSystem"),'title':("Sistema Operativo"),'titleKey':("citasAccessLog.operatingSystem")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',29,['property':("title"),'title':("Titulo Cita"),'titleKey':("citasAccessLog.title")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',30,['property':("description"),'title':("Descripción Cita"),'titleKey':("citasAccessLog.description")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',31,['property':("codigoST"),'title':("Código ST"),'titleKey':("citasAccessLog.codigoST")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',32,['property':("createdDate"),'title':("Fecha de operación"),'titleKey':("citasAccessLog.createdDate")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',33,['property':("fullName"),'title':("Nombre del usuario"),'titleKey':("citasAccessLog.fullName")],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',34,['property':("pais"),'title':("Pais"),'titleKey':("citasAccessLog.pais")],-1)
printHtmlPart(10)
loop:{
int i = 0
for( citasAccessLogInstance in (citasAccessLogList) ) {
printHtmlPart(11)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(12)
expressionOut.print(fieldValue(bean: citasAccessLogInstance, field: "action"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: citasAccessLogInstance, field: "ipAddress"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: citasAccessLogInstance, field: "browser"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: citasAccessLogInstance, field: "operatingSystem"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: citasAccessLogInstance, field: "title"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: citasAccessLogInstance, field: "description"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: citasAccessLogInstance, field: "codigoST"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: citasAccessLogInstance, field: "createdDate"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: citasAccessLogInstance, field: "fullName"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: citasAccessLogInstance, field: "pais"))
printHtmlPart(14)
i++
}
}
printHtmlPart(15)
invokeTag('paginate','g',58,['total':(citasAccessLogTotal)],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',64,[:],1)
printHtmlPart(17)
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
