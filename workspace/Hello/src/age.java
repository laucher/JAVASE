import java.util.Scanner;


public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int minor=35;
		
		System.out.print("�������������䣺");
		Scanner in=new Scanner(System.in);
		
		int age=in.nextInt();
		
		System.out.println("����������"+age);
		
		if (age<minor)
		{
			System.out.println("������������");
		}
		System.out.println("������������ľ������磬�ú���ϧ�ɡ�");
	}

}
