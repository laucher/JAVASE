package Ipo;

import java.io.File;
import java.io.IOException;


public class IOtest {

	public static void main(String[] args) throws IOException {
		String folderPath = "F:"+File.separator+"javaeasy"+File.separator+"testingfloder";
		File folder=new File(folderPath);
		String fileName="testingflie.txt";
		if(folder.exists()&&folder.isDirectory()){
			System.out.println("���ļ����Ѿ����ڣ�");
		}else{
			boolean creatFolders=folder.mkdirs();
			if(creatFolders){
				System.out.println("�ļ��д����ɹ���");
			}else{
				System.out.println("�ļ��д���ʧ�ܣ�");
				return;
			}
		}
		File file =new File(folder,fileName);
		if(file.exists()&&file.isFile()){
			System.out.println("�ļ��Ѿ����ڣ����ļ�ɾ����");
			boolean deleteFile =file.delete();
			if(deleteFile){
				System.out.println("�ļ�ɾ���ɹ���");
			}else{
				System.out.println("�ļ�ɾ��ʧ�ܣ�");
				return;
			}
		}
		try{
			file.createNewFile();
			System.out.println("�ļ������ɹ���");
		}catch(IOException e){
			System.out.println("�ļ�����ʧ��,������Ϣ��"+e.toString());
		}
	}

}
