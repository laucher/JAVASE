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
		mystring=mystring+"正在初始化~~~";
		this.repaint();
		mystringend=mystringend+"初始化结束";
	}
	public void start()
	{
		mystring=mystring+"正在启动程序~~~";
		this.repaint();
		mystringend=mystringend+"启动程序结束";
	}
	public void stop()
	{
		mystring=mystring+"正在停止程序~~~";
		this.repaint();
		mystringend=mystringend+"停止程序结束";
	}
	public void destroy()
	{
		mystring=mystring+"正在回收资源~~~";
		this.repaint();
		mystringend=mystringend+"回收资源结束";
	}
		
	

}
