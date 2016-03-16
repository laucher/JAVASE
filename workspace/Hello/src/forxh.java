import java.util.Scanner;


public class forxh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		int factor=1;
		for (int n=1;n<=i;n=n+1)
		{
			factor=factor*n;
		}
		System.out.println(factor);
		}
	}


