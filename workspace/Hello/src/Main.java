import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����");
		Scanner in=new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
//		System.out.println(2+3+"=2+3="+2+3+"=2+3="+(2+3));
		int price,amount;
		price=0;
		amount=0;
		System.out.print("��������ߣ���λ���ߣ���");
		price=in.nextInt();
		System.out.print("��������ߣ���λ���磩��");
		amount=in.nextInt();
		System.out.println("��������ǣ�"+(price+amount/3.0)*7.048+"cm");
	}

}
