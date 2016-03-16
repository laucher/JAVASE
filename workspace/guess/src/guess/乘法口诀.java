package guess;

public class ³Ë·¨¿Ú¾÷ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] number=new int[9][9];
		String res1="";
		for(int i=0;i<number.length;i++)
			{
			System.out.println("\n");
			for(int j=0;j<number[i].length;j++)
			{
				number[i][j]=(i+1)*(j+1);
				res1=" "+number[i][j];
				System.out.print(res1);
			}
			}
		
	}

}
