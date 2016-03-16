import java.util.Scanner;


public class ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 初始化
		Scanner in=new Scanner(System.in);
		// 请输入投币金额
		System.out.print("请努力:");
		int amount=in.nextInt();
		System.out.println(amount);
		System.out.println(amount>=10);
		if (amount>=10)
		// 打印车票
				{System.out.println("***********");
				 System.out.println("*通往梦想的列车*");
				 System.out.println("*他从来没迟到过*");
				 System.out.println("*票价10倍努力  *");
				 System.out.println("***********");
				 System.out.println("找零："+(amount-10));
				}
		if (amount<10)
		{System.out.println("请继续努力");
		System.out.println("梦想鄙视那些不愿意努力的人");
				}
	}

}
