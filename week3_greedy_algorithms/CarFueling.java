import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int n = stops.length-1;
        int numRefills = 0;
        int currentPosition = 0;
        int lastRefill = 0;
        
        //if (dist < tank)
          //return 0;
       // while (currentPosition <= n) {
         //   while (stops[currentPosition+1] - stops[currentPosition] <= tank) {
                
           // };
        //}
        while (currentPosition < n ){
            lastRefill = currentPosition;
            while (currentPosition < n && 
                    (stops[currentPosition+1] - stops[lastRefill]) <= tank) {
                currentPosition = currentPosition + 1;
            }
            if (currentPosition == lastRefill)
                return -1;
            if (currentPosition < n) 
                numRefills = numRefills + 1;
        }
        return numRefills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n+2];
        stops[0] = 0;
        stops[n+1]=dist;
        for (int i = 1; i <= n; i++) {
            stops[i] = scanner.nextInt();
        }
        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
