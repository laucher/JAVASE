import java.util.Scanner;


public class ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ʼ��
		Scanner in=new Scanner(System.in);
		// ������Ͷ�ҽ��
		System.out.print("��Ŭ��:");
		int amount=in.nextInt();
		System.out.println(amount);
		System.out.println(amount>=10);
		if (amount>=10)
		// ��ӡ��Ʊ
				{System.out.println("***********");
				 System.out.println("*ͨ��������г�*");
				 System.out.println("*������û�ٵ���*");
				 System.out.println("*Ʊ��10��Ŭ��  *");
				 System.out.println("***********");
				 System.out.println("���㣺"+(amount-10));
				}
		if (amount<10)
		{System.out.println("�����Ŭ��");
		System.out.println("���������Щ��Ը��Ŭ������");
				}
	}

}
