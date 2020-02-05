//package week1;

import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        long max_product, max_two;
        max_product = max_two = 0;
        int n = numbers.length;
        
        int max_ind1 = 0;
        for (int i = 1; i < n; ++i) {
            if(numbers[i] > numbers[max_ind1])
                max_ind1 = i;
        }
        //System.out.println("max1: " +max_ind1);
        for (int j = 0; j < n; ++j) {
            if (j != max_ind1){  
                max_two = Math.max(max_two, numbers[j]);
            }    
        }
        //System.out.println(max_one+ " " +max_two);
        max_product = numbers[max_ind1] * max_two;
        return max_product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Random random = new Random();
        //int n = 200000;
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
           // numbers[i] = random.nextInt(100000);
            //System.out.print(numbers[i]+ " ");
            numbers[i] = scanner.nextInt();
        }
        //List<Long> list = Arrays.asList(numbers);
        System.out.println(getMaxPairwiseProduct(numbers));
    }
}