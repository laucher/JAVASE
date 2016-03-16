package com.java.xml;

import java.io.File;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;




public class CreateDOMxml{
	
	
	public static void main(String[] args) throws Exception{
	
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document document=db.newDocument();
		document.setXmlStandalone(true);
		
		Element bookstore= document.createElement("bookestore");
		document.appendChild(bookstore);
		Element book= document.createElement("book");
		book.setAttribute("ID", "1");
		bookstore.appendChild(book);
		Element name= document.createElement("name");
		name.setTextContent("冰与火之歌");
		book.appendChild(name);
		
		TransformerFactory tff=TransformerFactory.newInstance();
		Transformer tf=tff.newTransformer();
		tf.setOutputProperty(OutputKeys.VERSION,"2.0");
		tf.setOutputProperty(OutputKeys.ENCODING,"gbk");
		tf.setOutputProperty(OutputKeys.INDENT,"yes");
		tf.transform(new DOMSource(document), new StreamResult(new File("dombooks.xml")));
		
		
	}
}