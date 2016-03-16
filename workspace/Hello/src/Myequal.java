import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Myequal {

	@SuppressWarnings("deprecation")
	public static <E> void main(String[] args) throws ParseException  {
		
/*////		String s1="hello";
////		String s2="hello2";
////		final String s3="hello";
////		String s4=s1+2;
////		String s5=s3+2;
////		System.out.println(s2==s4);
////		System.out.println(s2.equals(s4));
////		System.out.println(s5.equals(s2));
////		System.out.println(s5==s2);
////		
////		Integer i=new Integer(10);
////		int j=i.intValue();
////		String g=i+"";
////		j=Integer.parseInt(g);
////		j=Integer.valueOf(g);
////		Date now =new Date();
//		*/
//		Date now =new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("YYYY dd mm");
//		System.out.println(sdf.format(now));
//		String s="1990 01 01";
//		SimpleDateFormat sdf1=new SimpleDateFormat("y m d");
//		now=sdf.parse(s);
//		System.out.println(now);
		
		
//		Calendar c=Calendar.getInstance();
//		int year=c.get(Calendar.YEAR);
//		Date date=c.getTime();
//		int[] i=new int[10];
//		for(int j=0;j<i.length;j++){
//			int h=(int) (Math.random()*10);
//			i[j]=h;
//			System.out.println(i[j]);
//		}
//		String s1=new String(" Hello World ");
//		String fileName="hello.java";
//		int index=fileName.lastIndexOf(".");
//		String file=fileName.substring(index+1, fileName.length());
//		
//		
//		System.out.println(file);
//		String s2=s1.trim();
//		int inter= s1.indexOf("el");
//		String ui=s1.substring(4, 10);
//		String s3;
//		System.out.println(inter+"\n"+ui);
//		byte [] char1=s1.getBytes();
//		System.out.println((char)char1[2]);
//		char x='e';
//		System.out.println((char)char1[2]==x);
//		if(((char)char1[2])=='e');
//		char d=file.charAt(0);
//		System.out.println(d);
		ArrayList array=new ArrayList();
		LinkedList link=new LinkedList<E>();
		
		String aa="[a-z]{2,5}";
		Scanner in=new Scanner(System.in);
		String bb=in.next();
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(args[0]);
		
		
		
		

	}

}
