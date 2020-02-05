import java.util.*;

public class GCD {
    private static int euclidGCD(int a, int b) {
        int a_prime;
        if (b == 0)
            return a;
        a_prime = a % b;
        return euclidGCD(b, a_prime);
    }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(euclidGCD(a, b));
  }
}
