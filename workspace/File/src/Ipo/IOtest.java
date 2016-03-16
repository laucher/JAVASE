package Ipo;

import java.io.File;
import java.io.IOException;


public class IOtest {

	public static void main(String[] args) throws IOException {
		String folderPath = "F:"+File.separator+"javaeasy"+File.separator+"testingfloder";
		File folder=new File(folderPath);
		String fileName="testingflie.txt";
		if(folder.exists()&&folder.isDirectory()){
			System.out.println("该文件夹已经存在！");
		}else{
			boolean creatFolders=folder.mkdirs();
			if(creatFolders){
				System.out.println("文件夹创建成功！");
			}else{
				System.out.println("文件夹创建失败！");
				return;
			}
		}
		File file =new File(folder,fileName);
		if(file.exists()&&file.isFile()){
			System.out.println("文件已经存在，将文件删除！");
			boolean deleteFile =file.delete();
			if(deleteFile){
				System.out.println("文件删除成功！");
			}else{
				System.out.println("文件删除失败！");
				return;
			}
		}
		try{
			file.createNewFile();
			System.out.println("文件创建成功！");
		}catch(IOException e){
			System.out.println("文件创建失败,错误信息！"+e.toString());
		}
	}

}
