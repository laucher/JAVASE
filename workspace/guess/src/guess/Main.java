package guess;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(n + "=");
 
        int prime = 2, count = 0;
        while (prime <= n) {
            if (n % prime == 0) {
                n = n / prime;
                System.out.print((count++ == 0 ? "" : "x") + prime);
                System.out.println("java"+count);
            } else {
                prime++;
            }
        }
    }
}