import java.io.*;
import java.util.*;

public class MeanMedianMode {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        String data = scan.nextLine();

        int[] dataArray = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        double mean, median;
        int sum = 0, mode = 0;
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            sum += dataArray[i];

            if (countMap.get(dataArray[i]) != null) {
                countMap.put(dataArray[i], countMap.get(dataArray[i]) + 1);
            } else {
                countMap.put(dataArray[i], 1);
            }

        }

        mean = (double) sum / n;

        if (n % 2 == 0) {
            median = (double) (dataArray[(n / 2) - 1] + dataArray[(n / 2)]) / 2;
        } else {
            median = (double) dataArray[(n / 2)] / 2;
        }

        int modeCount = 1;
        mode = dataArray[0];
        for (int i = 0; i < n; i++) {
            if (countMap.get(dataArray[i]) > modeCount) {
                modeCount = countMap.get(dataArray[i]);
                mode = dataArray[i];
            }
        }

        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
    }
}
