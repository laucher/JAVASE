import java.util.Scanner;


public class pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 这里的scan是一个变量 表示新输入的变量  final的意思是表示该变量已经被引用 无法修改
		Scanner scan=new Scanner(System.in);
		final int pass=60;
		System.out.print("请输入成绩：");
		int score=scan.nextInt();
		if (score<pass)
		{System.out.println("恭喜您没有及格");
		System.out.println("下学期再见");
		}
		else
		{System.out.println("赶紧滚吧");}
	}

}
