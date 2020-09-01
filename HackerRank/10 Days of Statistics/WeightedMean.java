import java.io.*;
import java.util.*;

public class WeightedMean {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.nextLine();

        String data = scan.nextLine();
        int[] integerArray = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).toArray();

        data = scan.nextLine();
        int[] weightArray = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).toArray();

        double weight = 0;
        for(int i=0; i<n; i++) {
            weight += weightArray[i];
        }

        double sum = 0;
        for(int i=0; i<n; i++) {
            sum += integerArray[i] * weightArray[i];
        }
                
        double weightMean = sum / weight;
        System.out.printf("%.1f", weightMean);
    }
}