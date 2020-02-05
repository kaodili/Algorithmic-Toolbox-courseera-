//package week2_algorithmic_warmup;

import java.util.Scanner;

public class Fibonacci {
    private static long calc_fib(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                int[] fibArr = new int[n+1];
                fibArr[0] = 0;
                fibArr[1] = 1;
                for (int i = 2;  i < n+1; i++) {
                    fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
                }
                return fibArr[n];
        }
    }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
