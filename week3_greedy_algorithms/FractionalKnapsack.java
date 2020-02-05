import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FractionalKnapsack {
    private static int getMaxIndex(int[] weights, int[] values) {
        int max_ind = 0;
        double max = 0;

        for (int i = 0; i < weights.length; i++) {
            if ((double) values[i] / weights[i] > max) {
                max = (double) values[i] / weights[i];
                max_ind = i;
            }
        }
        return max_ind;
    }
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        int n  = values.length;
        int a;
        double totVal = 0;
        
        for (int i = 0; i < n; i++) {
            if (capacity == 0)
                return totVal;
            int index = getMaxIndex(weights, values);
            a = Math.min(capacity, weights[index]);
            totVal += a * (double) values[index] / weights[index];
            weights[index] -= a;
            capacity -= a;
        }        
        return totVal;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt(); //W
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
