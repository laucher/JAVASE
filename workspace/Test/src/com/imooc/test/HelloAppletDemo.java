package com.imooc.test;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.Properties;

public class HelloAppletDemo  extends Applet 
{
	String mystring="";
 	String mystringend="";
	public void paint(Graphics g)
	{
		g.drawString(mystring,5 ,30 );
		g.drawString(mystringend,5,60 );
	}
	public void init()
	{
		mystring=mystring+"���ڳ�ʼ��~~~";
		this.repaint();
		mystringend=mystringend+"��ʼ������";
	}
	public void start()
	{
		mystring=mystring+"������������~~~";
		this.repaint();
		mystringend=mystringend+"�����������";
	}
	public void stop()
	{
		mystring=mystring+"����ֹͣ����~~~";
		this.repaint();
		mystringend=mystringend+"ֹͣ�������";
	}
	public void destroy()
	{
		mystring=mystring+"���ڻ�����Դ~~~";
		this.repaint();
		mystringend=mystringend+"������Դ����";
	}
		
	

}
