package com.java.Handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SAXParserHandler extends DefaultHandler{
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("-------------������ʼ-------------");
		
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("-------------��������-------------");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		if(qName.equals("book")){
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.print("��"+(i+1)+"�����ԣ�"+attributes.getQName(i)+"  ");
				System.out.println(attributes.getValue(i));				
			}	
		}else{
		System.out.print(qName);
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		if(qName.equals("book"))
		System.out.println("---------����ĳһ����---------");
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		String s=new String(ch, start, length);
		if(!s.trim().equals("")){
			System.out.println("ֵΪ��"+s);
		}
	}

}