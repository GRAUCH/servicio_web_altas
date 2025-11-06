package serviciowebaltann

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.helpers.DefaultValidationEventHandler;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;

public class XMLUtils {
	
	private XMLUtils () {
		
	}
	
	/**
	 * 
	 * @param requestBean
	 * @return
	 * @throws JAXBException
	 */
	public static Document buildDocument (Object requestBean) throws ParserConfigurationException, JAXBException {
		Document requestDocument = null;
		
		if (requestBean != null) {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		    dbf.setNamespaceAware(true);
		    DocumentBuilder docBuilder = dbf.newDocumentBuilder();
			requestDocument = docBuilder.newDocument();
			
			JAXBContext jcjaxbContextRequest = JAXBContext.newInstance(requestBean.getClass());
			
			Marshaller marshaller = jcjaxbContextRequest.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);	
			marshaller.marshal(requestBean, requestDocument);
		}
		
		return requestDocument;
	}
	
	/**
	 * 
	 * @param responseString
	 * @param encodingType
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 */
	public static Document buildDocument (String responseString, String encodingType) throws UnsupportedEncodingException, 
																	IOException, SAXException, ParserConfigurationException {
		Document document = null;
		
		InputStream is = new ByteArrayInputStream(responseString.getBytes(encodingType));
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    dbf.setNamespaceAware(false);
	    dbf.setValidating(false);
	
	    document = dbf.newDocumentBuilder().parse(is);
		
		return document;
	}
	
	/**
	 * 
	 * @param responseDocument
	 * @param responseBeanClass
	 * @return
	 * @throws JAXBException
	 */
	public static Object getResponseBean (Document responseDocument, Class <?> responseBeanClass) throws JAXBException {
		
		JAXBContext jcjaxbContextResponse = JAXBContext.newInstance(responseBeanClass);
		Unmarshaller unmarshaller = jcjaxbContextResponse.createUnmarshaller();
		
		return unmarshaller.unmarshal(responseDocument);
	}
	
	
	/**
	 * 
	 * @param structure La estructura de datos (beans) que queremos transformar en XML
	 * @param classArray El array de nodos relevantes del array (marcados con la notación @RootElement)
	 * @return Un objeto StringWriter que representa el XML
	 */
	public static StringWriter marshall (Object structure, Class<?>[] classArray) throws JAXBException, IOException {
		
		StringWriter writer = new StringWriter();
		
		JAXBContext jcjaxbContextRequest = JAXBContext.newInstance(classArray);
		jcjaxbContextRequest = JAXBContext.newInstance(classArray);		
		Marshaller marshaller = jcjaxbContextRequest.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		
		try {
			marshaller.marshal(structure, writer);
		} finally {
		    writer.close();
		}
		
		return writer;
	}
	
	/**
	 * 
	 * @param file
	 * @param classArray
	 * @return
	 * @throws JAXBException
	 */
	public static Object unmarshall (File file, Class<?>[] classArray) throws JAXBException {
		
		JAXBContext context;
		
		context = JAXBContext.newInstance(classArray);		
		Unmarshaller um;			
		um = context.createUnmarshaller();
		

		return um.unmarshal(file);
	}
	
	/**
	 * 
	 * @param xmlFile
	 * @param classArray
	 * @return
	 * @throws JAXBException
	 */
	public static Object unmarshall (String xmlFile, Class<?>[] classArray) throws JAXBException, IOException {
		Object result = null;
		
		JAXBContext context;
		
		context = JAXBContext.newInstance(classArray);		
		Unmarshaller um;			
		um = context.createUnmarshaller();

		InputStream is = new ByteArrayInputStream(xmlFile.getBytes());
		result = um.unmarshal(is);
		is.close();
		 
		return result;
	}
	
	/**
	 * 
	 * @param xmlFile
	 * @param classArray
	 * @return
	 * @throws JAXBException
	 */
	public static Object unmarshallAndValidate (String xmlFile, Class<?>[] classArray, String xsdFilePath) throws JAXBException, IOException, SAXException {
		Object result = null;
		
		JAXBContext context;
		
		context = JAXBContext.newInstance(classArray);		
		Unmarshaller um;			
		um = context.createUnmarshaller();

		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
	    Schema schema = sf.newSchema(new File(xsdFilePath)); 
	    um.setSchema(schema);
	    um.setEventHandler(new DefaultValidationEventHandler());
	 
	    InputStream is = new ByteArrayInputStream(xmlFile.getBytes());
		result = um.unmarshal(is);
		is.close();
		 
		return result;
	}
	
	
	/**
	 * 
	 * @param doc
	 * @return
	 */
	public static String getDocumentAsString(Document doc) {
		DOMImplementationLS domImplementation = (DOMImplementationLS) doc.getImplementation();
		LSSerializer lsSerializer = domImplementation.createLSSerializer();
		
		return lsSerializer.writeToString(doc);
	}	
	

	/**
	 * 
	 * @param interviewP
	 * @return
	 * @throws JAXBException
	 */
	public static String generateXML (Object object) throws  JAXBException, IOException {
		StringWriter sw = null;
		
		Class <?>[] clasesXML = new Class <?>[1];
		clasesXML[0] = object.getClass();
				
		sw = marshall(object, clasesXML);
				
		return sw.toString();
	}
}
