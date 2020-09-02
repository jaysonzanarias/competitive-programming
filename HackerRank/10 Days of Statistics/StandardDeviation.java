import java.io.*;
import java.util.*;

public class StandardDeviation {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        // Sample Input
        // 5
        // 10 40 30 50 20

        // Sample Output
        // 14.1

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.nextLine();

        String data = scan.nextLine();
        int[] integerArray = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).toArray();

        double mean = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += integerArray[i];
        }

        mean = sum / n;

        double summationOfSquaredDistance = 0;
        for (int i = 0; i < n; i++) {
            double distance = (integerArray[i] - mean);
            summationOfSquaredDistance += distance * distance;
        }

        double standardDeviation = Math.sqrt(summationOfSquaredDistance / n);
        System.out.printf("%.1f", standardDeviation);
    }
}