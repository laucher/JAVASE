package Ipo;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MyCreat {
	
	public void renamefile(String Path){
		File myfile=new File(Path);
		File other=new File(myfile.getParentFile(),"����.txt");
		if(myfile.exists()){
			if(myfile.isDirectory()){
				System.out.println("�����һ���ļ��������ļ��С�");
			}else{
				if(myfile.isFile()){
					if(myfile.renameTo(other)){
						System.out.println("�������ɹ�!");
					}else{
						System.out.println("������ʧ��!");
					}
				}
			}
		}else{
			System.out.println("�ļ������ڣ�");
		}
	}
	

	public File creatFile(String Path) throws IOException{//������������ļ�����
		File myfile=new File(Path);
		if(myfile.exists()&&myfile.isFile()){
			System.out.println(Path+"�µ�·���Ѿ������ļ�!\n"+"����ɾ���ļ�!");
			if(myfile.delete()){
				System.out.println("ɾ���ɹ�!");
				myfile=null;
			}else{
				System.out.println("ɾ��ʧ��!");
			}
		}else{
			if(myfile.createNewFile()){
				System.out.println("�ļ������ɹ���");
			}else{
				System.out.println("�ļ�����ʧ�ܣ�");
				myfile=null;
			}			
		}
		return myfile;
	}	

	public void creatFolder(String Path){
		File myfile=new File(Path);
		if(myfile.exists()&&myfile.isDirectory()){
			System.out.println(Path+"�µ�·���Ѿ������ļ���!\n"+"����ɾ���ļ���!");
			if(myfile.delete()){
				System.out.println("ɾ���ɹ�!");
			}else{
				System.out.println("ɾ��ʧ��!");
			}
		}else{
			if(myfile.mkdirs()){
				System.out.println("�ļ��д����ɹ���");
			}else{
				System.out.println("�ļ��д���ʧ�ܣ�");
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyCreat mycreat=new MyCreat();
		String folderpath="E:"+File.separator+"���Ը����ļ���"+File.separator+"���������ļ���";
		String filename="�����ļ�1.txt";
		mycreat.creatFolder(folderpath);
		File other=mycreat.creatFile(folderpath+File.separator+filename);
		//mycreat.renamefile(other.getAbsolutePath());
		PrintWriter pw=new PrintWriter(other);
		pw.write(other.getAbsolutePath());
		pw.close();
		
		
		
	}

}
