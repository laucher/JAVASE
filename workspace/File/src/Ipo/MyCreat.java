package Ipo;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MyCreat {
	
	public void renamefile(String Path){
		File myfile=new File(Path);
		File other=new File(myfile.getParentFile(),"测试.txt");
		if(myfile.exists()){
			if(myfile.isDirectory()){
				System.out.println("请给我一个文件而不是文件夹。");
			}else{
				if(myfile.isFile()){
					if(myfile.renameTo(other)){
						System.out.println("重名命成功!");
					}else{
						System.out.println("重命名失败!");
					}
				}
			}
		}else{
			System.out.println("文件不存在！");
		}
	}
	

	public File creatFile(String Path) throws IOException{//变量必须包含文件名。
		File myfile=new File(Path);
		if(myfile.exists()&&myfile.isFile()){
			System.out.println(Path+"下的路径已经存在文件!\n"+"即将删除文件!");
			if(myfile.delete()){
				System.out.println("删除成功!");
				myfile=null;
			}else{
				System.out.println("删除失败!");
			}
		}else{
			if(myfile.createNewFile()){
				System.out.println("文件创建成功！");
			}else{
				System.out.println("文件创建失败！");
				myfile=null;
			}			
		}
		return myfile;
	}	

	public void creatFolder(String Path){
		File myfile=new File(Path);
		if(myfile.exists()&&myfile.isDirectory()){
			System.out.println(Path+"下的路径已经存在文件夹!\n"+"即将删除文件夹!");
			if(myfile.delete()){
				System.out.println("删除成功!");
			}else{
				System.out.println("删除失败!");
			}
		}else{
			if(myfile.mkdirs()){
				System.out.println("文件夹创建成功！");
			}else{
				System.out.println("文件夹创建失败！");
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyCreat mycreat=new MyCreat();
		String folderpath="E:"+File.separator+"测试父类文件夹"+File.separator+"测试子类文件夹";
		String filename="测试文件1.txt";
		mycreat.creatFolder(folderpath);
		File other=mycreat.creatFile(folderpath+File.separator+filename);
		//mycreat.renamefile(other.getAbsolutePath());
		PrintWriter pw=new PrintWriter(other);
		pw.write(other.getAbsolutePath());
		pw.close();
		
		
		
	}

}
