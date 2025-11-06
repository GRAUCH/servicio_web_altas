import org.joda.time.Instant
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_citas_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/citas/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(resource(dir: 'css', file: 'jquery/jquery.datetimepicker.css'))
printHtmlPart(1)
invokeTag('javascript','asset',4,['src':("/jquery/jquery.datetimepicker.full.js")],-1)
printHtmlPart(2)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'event.label', default: 'Event'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: citaInstance, field: 'title', 'error'))
printHtmlPart(4)
invokeTag('message','g',9,['code':("event.title.label"),'default':("Title")],-1)
printHtmlPart(5)
invokeTag('textField','g',10,['name':("title"),'id':("title"),'value':(citaInstance?.title)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: citaInstance, field: 'description', 'error'))
printHtmlPart(7)
invokeTag('message','g',13,['code':("event.description.label"),'default':("Description")],-1)
printHtmlPart(5)
invokeTag('textArea','g',14,['name':("description"),'id':("description"),'value':(citaInstance?.description)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: citaInstance, field: 'company', 'error'))
printHtmlPart(9)
invokeTag('message','g',18,['code':("event.location.label"),'default':("Compañía")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("company"),'id':("company"),'value':(citaInstance?.company?.name),'readonly':("true")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: citaInstance, field: 'numeroExpediente', 'error'))
printHtmlPart(10)
invokeTag('message','g',22,['code':("event.location.label"),'default':("Numero Expediente")],-1)
printHtmlPart(5)
invokeTag('textField','g',23,['name':("numeroExpediente"),'id':("numeroExpediente"),'value':(citaInstance?.numeroExpediente)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: citaInstance, field: 'startTime', 'error'))
printHtmlPart(11)
invokeTag('message','g',27,['code':("event.startTime.label"),'default':("Start Time")],-1)
printHtmlPart(12)
expressionOut.print(citaInstance?.startTime.format("dd/MM/yyyy HH:mm"))
printHtmlPart(13)
expressionOut.print(hasErrors(bean: citaInstance, field: 'endTime', 'error'))
printHtmlPart(14)
invokeTag('message','g',37,['code':("event.endTime.label"),'default':("End Time")],-1)
printHtmlPart(15)
expressionOut.print(citaInstance?.endTime.format("dd/MM/yyyy HH:mm"))
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
