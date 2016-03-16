import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("您好");
		Scanner in=new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
//		System.out.println(2+3+"=2+3="+2+3+"=2+3="+(2+3));
		int price,amount;
		price=0;
		amount=0;
		System.out.print("请输入身高（单位：尺）；");
		price=in.nextInt();
		System.out.print("请输入身高（单位：寸）：");
		amount=in.nextInt();
		System.out.println("您的身高是："+(price+amount/3.0)*7.048+"cm");
	}

}
