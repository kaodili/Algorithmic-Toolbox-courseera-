//package week2_algorithmic_warmup;

import java.util.*;

public class LCM {
    private static int euclidGCD(int a, int b) {
        int a_prime;
        if (b == 0)
            return a;
        a_prime = a % b;
        return euclidGCD(b, a_prime);
    }
    private static long euclidLCM(int a, int b) {
        long gcd, lcm;
        gcd =  euclidGCD(a, b);
        lcm =  (a / gcd) * b; 
        return lcm;
    }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(euclidLCM(a, b));
  }
}
