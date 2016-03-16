package Ipo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Youknownothing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="E:"+"我不知道"+File.separator+"本儿吧波"+File.separator;
		File file=new File(path);
		file.mkdirs();
		File file1=new File(path,"ww.txt");
		file1.createNewFile();
		PrintWriter pw=new PrintWriter(file1); 
		pw.write("我不知道哎传说中的勇者传说\n是是实施");
		pw.close();
		FileReader fr=new FileReader(file1);
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null){
		System.out.println(s);
			};
		fr.close();
		br.close();
	}

}
