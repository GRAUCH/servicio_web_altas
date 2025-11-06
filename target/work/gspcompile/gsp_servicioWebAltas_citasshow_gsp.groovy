import org.joda.time.Instant
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_citasshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/citas/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'css', file: 'main.css'))
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("X-UA-Compatible"),'content':("IE = 11")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
expressionOut.print(message(code: 'calendar.show.menu', default: 'Volver al calendario'))
})
invokeTag('link','g',20,['controller':("citas"),'action':("index"),'class':("calendar")],2)
printHtmlPart(7)
expressionOut.print(citaInstance?.title)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('render','g',35,['template':("form"),'model':([citaInstance: citaInstance])],-1)
printHtmlPart(12)
invokeTag('hiddenField','g',38,['name':("id"),'value':(citaInstance?.id)],-1)
printHtmlPart(13)
invokeTag('hiddenField','g',39,['name':("slots"),'id':("slots"),'value':(slots[0].tiempoPorTurno)],-1)
printHtmlPart(13)
invokeTag('hiddenField','g',42,['name':("iniDate"),'id':("iniDate"),'value':(slots[0].horaInicio)],-1)
printHtmlPart(13)
invokeTag('hiddenField','g',43,['name':("finDate"),'id':("finDate"),'value':(slots[0].horaFin)],-1)
printHtmlPart(13)
invokeTag('actionSubmit','g',45,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(13)
invokeTag('actionSubmit','g',49,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'formnovalidate':(""),'onclick':("return confirm('¿Está segura de que desea eliminar la cita?')")],-1)
printHtmlPart(14)
})
invokeTag('form','g',49,[:],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',49,[:],1)
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
