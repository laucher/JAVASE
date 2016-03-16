package Ipo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Fileoperation {
	
	private static void printPath(List list){
		for(int i=0;i<list.size();i++){
			System.out.println(((File)list.get(i)).getName());
		}
	}

	public static void main(String[] args) {
		String folderPath="E:"+File.separator+"学习资料";
//		if(args.length!=1){
//			System.out.println("程序需要一个文件夹路径作为参数。");
//			return;
//		}
		File folder=new File(folderPath);
		if(!folder.exists()){
			System.out.println(folderPath+"不是有效的路径！");
			return;
		}
		if(!folder.isDirectory()){
			System.out.println(folderPath+"不是有效的文件夹！");
			return;
		}
		File[] allFiles=folder.listFiles();
		List file=new ArrayList();
		List folders=new ArrayList();
		for(File myfile:allFiles){
			if(myfile.isDirectory()){
				folders.add(myfile);
			}else{
				file.add(myfile);
			}
		}
		System.out.println("文件夹\""+folderPath+"\"中包含如下文件夹:");
		Fileoperation.printPath(folders);
		System.out.println("文件夹\""+folderPath+"\"中包含如下文件:");
		Fileoperation.printPath(file);
	}

}
