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
		
		//添加关闭事件
		myFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		//初始菜单项
		menubar=new MenuBar();
		file=new Menu("文件");
		edit=new Menu("编辑");
		editSon=new Menu("二级菜单");
		about=new Menu("关于");
		
		open=new MenuItem("打开");
		save=new MenuItem("保存");
		line=new MenuItem("我不知道");
		exit=new MenuItem("退出");
		file.add(open);
		file.add(save);
		file.add(line);
		file.add(exit);
		menubar.add(file);
		copy=new MenuItem("复制");
		pause=new MenuItem("粘贴");
		edit.add(copy);
		edit.add(pause);
		cut=new MenuItem("剪切");
		put=new MenuItem("拿出");
		editSon.add(cut);
		editSon.add(put);
		
		//Menu add Menu......!!
		edit.add(editSon);
		menubar.add(edit);
		author=new MenuItem("作者");
		help=new MenuItem("帮助");
		about.add(author);
		about.add(help);
		menubar.add(about);
		//设置menuBar
		myFrame.setMenuBar(menubar);
		
		myFrame.setVisible(true);
	}
	public static void main(String[] args) //~!@
	{
		new MyMenu();
	}

}



