import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_citasindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/citas/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("X-UA-Compatible"),'content':("IE = 11")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Cache-control"),'content':("no-cache")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Expires"),'content':("-1")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',14,['src':("elementosCitas/core/main.css"),'rel':("stylesheet")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',15,['src':("elementosCitas/daygrid/main.css"),'rel':("stylesheet")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',16,['src':("elementosCitas/timegrid/main.css"),'rel':("stylesheet")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',17,['src':("elementosCitas/list/main.css"),'rel':("stylesheet")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',18,['src':("elementosCitas/core/main.css"),'rel':("stylesheet")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',19,['src':("elementosCitas/daygrid/main.css"),'rel':("stylesheet")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',20,['src':("elementosCitas/timegrid/main.css"),'rel':("stylesheet")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',21,['src':("elementosCitas/list/main.css"),'rel':("stylesheet")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',22,['src':("elementosCitas/toolTip/toolTip.css"),'rel':("stylesheet")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',23,['src':("bootstrap/bootstrap.css"),'rel':("stylesheet")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',24,['src':("elementosCitas/core/main.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',26,['src':("elementosCitas/core/locales-all.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',27,['src':("elementosCitas/core/locales/es.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',28,['src':("elementosCitas/interaction/main.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',29,['src':("elementosCitas/daygrid/main.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',30,['src':("elementosCitas/timegrid/main.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',31,['src':("elementosCitas/list/main.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',32,['src':("jquery/jquery-1.9.1.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',33,['src':("bootstrap.js")],-1)
printHtmlPart(4)
invokeTag('javascript','asset',37,['src':("popper.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',37,['src':("tooltip.min.js")],-1)
printHtmlPart(5)
invokeTag('javascript','asset',38,['src':("calendar.js")],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',38,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('render','g',40,['template':("/comun/menu")],-1)
printHtmlPart(0)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('select','g',62,['class':("form-control"),'style':("max-width:95%;height: 35px;"),'optionKey':("id"),'from':(paises),'value':(pais.id),'name':("pais_id"),'id':("pais_id"),'onchange':("submit(this.value)"),'optionValue':("nombre")],-1)
printHtmlPart(9)
invokeTag('actionSubmit','g',64,['value':("Refrescar"),'class':("fc-addEventButton-button fc-button fc-button-primary"),'action':("index")],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(0)
})
invokeTag('form','g',72,['controller':("citas")],2)
printHtmlPart(13)
invokeTag('render','g',76,['template':("modalNuevaCita"),'model':(['configuraciones': configuraciones, 'companyas': companyas])],-1)
printHtmlPart(14)
invokeTag('hiddenField','g',81,['name':("nuevacita"),'value':(createLink(controller: 'citas', action: 'nueva'))],-1)
printHtmlPart(0)
invokeTag('hiddenField','g',83,['name':("slots"),'id':("slots"),'value':(slots[0].tiempoPorTurno)],-1)
printHtmlPart(0)
invokeTag('hiddenField','g',85,['name':("iniDate"),'id':("iniDate"),'value':(slots[0].horaInicio)],-1)
printHtmlPart(0)
invokeTag('hiddenField','g',91,['name':("finDate"),'id':("finDate"),'value':(slots[0].horaFin)],-1)
printHtmlPart(0)
invokeTag('hiddenField','g',92,['name':("configuracion"),'value':(createLink(controller: 'citas', action: 'index'))],-1)
printHtmlPart(0)
invokeTag('hiddenField','g',93,['name':("updateCitas"),'value':(createLink(controller: 'citas', action: 'list'))],-1)
printHtmlPart(0)
})
invokeTag('captureBody','sitemesh',94,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1733850609000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
