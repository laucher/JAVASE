import java.util.Scanner;


public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int minor=35;
		
		System.out.print("请输入您的年龄：");
		Scanner in=new Scanner(System.in);
		
		int age=in.nextInt();
		
		System.out.println("您的年龄是"+age);
		
		if (age<minor)
		{
			System.out.println("年轻是美丽的");
		}
		System.out.println("年龄决定了您的精神世界，好好珍惜吧。");
	}

}
