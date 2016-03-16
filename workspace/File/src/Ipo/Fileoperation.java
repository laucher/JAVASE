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
		String folderPath="E:"+File.separator+"ѧϰ����";
//		if(args.length!=1){
//			System.out.println("������Ҫһ���ļ���·����Ϊ������");
//			return;
//		}
		File folder=new File(folderPath);
		if(!folder.exists()){
			System.out.println(folderPath+"������Ч��·����");
			return;
		}
		if(!folder.isDirectory()){
			System.out.println(folderPath+"������Ч���ļ��У�");
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
		System.out.println("�ļ���\""+folderPath+"\"�а��������ļ���:");
		Fileoperation.printPath(folders);
		System.out.println("�ļ���\""+folderPath+"\"�а��������ļ�:");
		Fileoperation.printPath(file);
	}

}
