package serviciowebaltann

import groovy.json.StringEscapeUtils

import java.text.DateFormat
import java.text.SimpleDateFormat

import javax.xml.datatype.XMLGregorianCalendar
import javax.xml.datatype.DatatypeFactory

class FechaUtils {
	
	private static final String innerDateFormat = "yyyyMMdd";
	
	public static String getCurrentDateAsString () {
		return dateToString(getCurrentDate(), innerDateFormat);
	}
	
	public static Date getCurrentDate () {
		Calendar cal = new GregorianCalendar();
		
		return cal.getTime();
	}
	
	public static String dateToString(Date valor, String format) {
		String result = "";
		
		if (valor != null && (format != null && !format.trim().equals(""))) {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			result = sdf.format(valor);
		}
		
		return result;
	}
	
	public static String dateFechaInternaToString (Date valor) {
		return dateToString(valor, innerDateFormat);
	}
	
	
	public static XMLGregorianCalendar fromStringToXmlCalendar(String fecha) {
		
		String format = null
		
		if (fecha != null && !fecha.isEmpty()){
			
			GregorianCalendar cal = new GregorianCalendar()
			
			if (fecha.contains('/')){
				format = "yyyy/MM/dd"
			} else if (fecha.contains('-')){
				format = "yyyy-MM-dd"
			}
			
			if (fecha.contains('T')){
				cal.setTime(new SimpleDateFormat(format).parse(fecha.substring(0,fecha.indexOf('T'))))
			} else {
				cal.setTime(new SimpleDateFormat(format).parse(fecha))
			}
			
			XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal)

			return calendar

		} else {
			return null
		}

	}
	
	public static Calendar fromStringToCalendar(String fecha) {
		
		String format = null;
		
		if (fecha != null && !fecha.isEmpty()){
		  
		  GregorianCalendar cal = new GregorianCalendar();
		  
		  if (fecha.contains("/")){
			format = "yyyy/MM/dd";
		  } else if (fecha.contains("-")){
			format = "yyyy-MM-dd";
		  }
		  
		  if (fecha.contains("T")){
			cal.setTime(new SimpleDateFormat(format).parse(fecha.substring(0,fecha.indexOf('T'))));
		  } else {
			cal.setTime(new SimpleDateFormat(format).parse(fecha));
		  }
	
		  return cal;
	
		} else {
		  return null;
		}
	
	  }

	  public static String getDateFormat(String date){
		  
		  if (date.contains("/")){
			  if(date.indexOf("/") ==2){
				  return "dd/MM/yyyy"
			  }else if(date.indexOf("/") ==3){
				  return "yyyy/MM/dd"
			  }else{
				  return ""
			  }
				  
		  } else if (date.contains("-")){
			  if(date.indexOf("-") ==2){
				  return "dd-MM-yyyy"
			  }else if(date.indexOf("/") ==3){
				  return "yyyy-MM-dd"
			  }else{
				  return ""
			  }
		  }else{
			  return ""
		  }
		  
	  }	  
	
}
