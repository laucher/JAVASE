import java.util.Scanner;


public class pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����scan��һ������ ��ʾ������ı���  final����˼�Ǳ�ʾ�ñ����Ѿ������� �޷��޸�
		Scanner scan=new Scanner(System.in);
		final int pass=60;
		System.out.print("������ɼ���");
		int score=scan.nextInt();
		if (score<pass)
		{System.out.println("��ϲ��û�м���");
		System.out.println("��ѧ���ټ�");
		}
		else
		{System.out.println("�Ͻ�����");}
	}

}
