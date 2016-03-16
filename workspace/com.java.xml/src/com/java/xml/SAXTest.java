package com.java.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.java.Handler.SAXParserHandler;

public class SAXTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXParserFactory saf=SAXParserFactory.newInstance();
		try {
			SAXParser sp=saf.newSAXParser();
			SAXParserHandler handler=new SAXParserHandler();
			sp.parse(new FileInputStream("book.xml"), handler);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
