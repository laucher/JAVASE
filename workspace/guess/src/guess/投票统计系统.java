package guess;

import java.util.Scanner;

public class ͶƱͳ��ϵͳ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers=new int[10];
		int  vote;
		Scanner in=new Scanner(System.in);
		vote=in.nextInt();
		while(vote!=-1)
		{
			if(vote>=0 && vote<=9 )
			{
			numbers[vote]=numbers[vote]+1;
			}
			vote=in.nextInt();
		}
		for(int i=0;i<numbers.length;i++)
		{
		System.out.print(i+"Ʊ��Ϊ"+numbers[i]);
		}
	}

}
