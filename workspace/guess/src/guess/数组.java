package guess;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������ڲ���Աlength��ʾ�ڲ��ж��ٸ�Ԫ��
		//��������length
		Scanner in=new Scanner(System.in);
		double sum=0;
		int cnt=0;
		cnt=in.nextInt();
		if(cnt>0)
		{
			int[] nubmers=new int[cnt];
			for(int i=0;i<cnt;i++)
			{
				nubmers[i]=in.nextInt();
				sum+=nubmers[i];
			}
			double aveage=sum/cnt;
			for(int i=0;i<cnt;i++)
			{
				if(nubmers[i]>aveage)
				{
					System.out.println(nubmers[i]);
				}
			}
			System.out.println(aveage);
		}
	}

}
