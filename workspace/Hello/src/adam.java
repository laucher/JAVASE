
import java.util.Scanner;
 
public class adam {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = n + "=";
        while(n > 1)
        {
            for(int i = 2; i <= n; i++)
            {
                if(n%i == 0)
                {
                    res = res + i + "x";
                    n =n/i;
                    break;
                }
            }
        }
        res = res.substring(0, res.length()-1);
        System.out.println(res);
    }
}