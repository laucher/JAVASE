package com.java.xml;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class CreateDOM4Jxml {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Document document=DocumentHelper.createDocument();
		Element rss=document.addElement("rss");
		rss.addAttribute("version", "2.0");
		File file=new File("rss.xml");
		Element channel=rss.addElement("channel");
		Element title=channel.addElement("title");
		title.setText("<国内最新新闻>");
		OutputFormat format=OutputFormat.createPrettyPrint();
		format.setEncoding("gbk");
		XMLWriter writer= new XMLWriter(new FileOutputStream(file),format);
		writer.setEscapeText(false);
		writer.write(document);
		writer.close();	
	}
}