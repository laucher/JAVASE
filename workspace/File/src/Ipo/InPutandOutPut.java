package Ipo;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;


public class InPutandOutPut {

	public static void main (String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		File datafile=new File("E:"+File.separator+"这是流文件");
		String s1="E:"+File.separator+"这是流文件"+File.separator;
		datafile.mkdirs();
		File datafile1=new File(s1,"Stream.txt");
		datafile1.createNewFile();
		
		PrintWriter pw=null;
		if(datafile1==null){
			System.out.println("创建数据文件，程序退出！");
			return;
		}
		try{
			pw=new PrintWriter(datafile1);	
		}catch(FileNotFoundException e1){
			e1.printStackTrace();
			return;
		}
		String content=null;
		String endMark="end";
		try{
			System.out.println("请输入要写入文件的内容，以end结束！");
			while((content=br.readLine())!=null){
				if(content.equalsIgnoreCase(endMark)){
					break;
				}
				pw.write(content+"\t\n");
			}
			pw.close();
			br.close();
		}catch(IOException e){
			e.printStackTrace();	
		}
	}

}
