import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        int[] coins = { 10, 5, 1 };
	int change = 0;
	for (int i = 0; m > 0; i++) {
            change += m / coins[i];
            m %= coins[i];
	}
	return change;
 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

