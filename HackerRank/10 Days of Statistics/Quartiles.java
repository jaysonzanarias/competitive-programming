import java.io.*;
import java.util.*;

public class Quartiles {

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

        // TEST DATA
        // int[] dataArray = {18, 45, 55, 70, 76, 83, 88, 90, 92, 92, 95, 98}; // EVEN
        // int[] dataArray = { 3, 5, 7, 8, 12, 13, 14, 18, 21 }; // ODD

        getQuartiles(dataArray, 4);
    }

    public static void getQuartiles(int[] dataArray, int divideBy) {
        int n = dataArray.length;

        if (divideBy >= 2) {
            int median;
            int[] first_half;
            int[] second_half;

            if (n % 2 == 0) {
                median = (dataArray[(n / 2) - 1] + dataArray[(n / 2)]) / 2;
                first_half = Arrays.copyOfRange(dataArray, 0, (n / 2));
                second_half = Arrays.copyOfRange(dataArray, (n / 2), dataArray.length);

                getQuartiles(first_half, divideBy / 2);
                System.out.println(median);
                getQuartiles(second_half, divideBy / 2);
            } else {
                median = dataArray[(n / 2)];
                first_half = Arrays.copyOfRange(dataArray, 0, (n / 2));
                second_half = Arrays.copyOfRange(dataArray, (n / 2) + 1, dataArray.length);

                getQuartiles(first_half, divideBy / 2);
                System.out.println(median);
                getQuartiles(second_half, divideBy / 2);
            }
        }
    }
}