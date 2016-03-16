package com.javaeasy.simplecopier;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyMenu {
	Frame myFrame;
	MenuBar menubar;
	Menu file,edit,editSon,about;
	MenuItem open,save,line,exit,
			copy,pause,
				cut,put,
			author,help;
	public MyMenu()
	{
		myFrame=new Frame("Chevi.C Menu(awt)");
		myFrame.setBounds(400,400,300,300);
		
		//��ӹر��¼�
		myFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		//��ʼ�˵���
		menubar=new MenuBar();
		file=new Menu("�ļ�");
		edit=new Menu("�༭");
		editSon=new Menu("�����˵�");
		about=new Menu("����");
		
		open=new MenuItem("��");
		save=new MenuItem("����");
		line=new MenuItem("�Ҳ�֪��");
		exit=new MenuItem("�˳�");
		file.add(open);
		file.add(save);
		file.add(line);
		file.add(exit);
		menubar.add(file);
		copy=new MenuItem("����");
		pause=new MenuItem("ճ��");
		edit.add(copy);
		edit.add(pause);
		cut=new MenuItem("����");
		put=new MenuItem("�ó�");
		editSon.add(cut);
		editSon.add(put);
		
		//Menu add Menu......!!
		edit.add(editSon);
		menubar.add(edit);
		author=new MenuItem("����");
		help=new MenuItem("����");
		about.add(author);
		about.add(help);
		menubar.add(about);
		//����menuBar
		myFrame.setMenuBar(menubar);
		
		myFrame.setVisible(true);
	}
	public static void main(String[] args) //~!@
	{
		new MyMenu();
	}

}



