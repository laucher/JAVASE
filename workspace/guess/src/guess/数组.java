package guess;

import java.util.Scanner;

public class 数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 数组有内部成员length表示内部有多少个元素
		//数组名。length
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
