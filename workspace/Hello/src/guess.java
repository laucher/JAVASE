import java.util.Scanner;


public class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=(int)(Math.random()*100+1);
		Scanner in= new Scanner(System.in);
		int account=0;
		int a;
		do
		{
		a=in.nextInt();
		account=account+1;
		if (a>number)
		{
			System.out.println("�µ�������");
		}
		else if (a<number)
		{
			System.out.println("�µ���С��");
			}
		}while(a!=number);
			System.out.println("��ϲ��¶��ˣ�һ������"+account+"�Σ�");
		}				
	}


