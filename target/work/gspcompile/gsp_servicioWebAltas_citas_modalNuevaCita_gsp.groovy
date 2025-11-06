import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_servicioWebAltas_citas_modalNuevaCita_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/citas/_modalNuevaCita.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(resource(dir: 'css', file: 'jquery/jquery.datetimepicker.css'))
printHtmlPart(1)
invokeTag('javascript','asset',3,['src':("/jquery/jquery.datetimepicker.full.js")],-1)
printHtmlPart(2)
invokeTag('select','g',21,['class':("form-control input-sm"),'id':("inputConfig"),'optionKey':("id"),'from':(configuraciones),'name':("config"),'optionValue':("nombre")],-1)
printHtmlPart(3)
invokeTag('textField','g',26,['name':("title"),'id':("inputTitle"),'class':("form-control input-sm")],-1)
printHtmlPart(4)
invokeTag('textField','g',31,['name':("description"),'id':("inputDescription"),'class':("form-control input-sm")],-1)
printHtmlPart(5)
invokeTag('textField','g',36,['name':("numeroExpediente"),'id':("inputNumeroExpediente"),'class':("form-control input-sm")],-1)
printHtmlPart(6)
invokeTag('select','g',41,['class':("form-control input-sm"),'id':("inputCompany"),'optionKey':("id"),'from':(companyas),'name':("company"),'optionValue':("name")],-1)
printHtmlPart(7)
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
