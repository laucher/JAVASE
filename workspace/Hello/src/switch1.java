import java.util.Scanner;


public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int aou=in.nextInt();
		switch (aou) {
		case 10:
			aou=90;
			System.out.println(aou);
			break;

		default:
			System.out.println(aou);
			break;
		}
	}

}
