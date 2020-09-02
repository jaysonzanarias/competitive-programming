import java.io.*;
import java.util.*;

public class InterquartileRange {

    public static void main(String[] args) {
        // Sample Input
        // 6
        // 6 12 8 10 20 16
        // 5 4 3 2 1 5

        // Sample Output
        // 9.0

        // S = {6, 6, 6, 6, 6, 8, 8, 8, 10, 10, 12, 12, 12, 12, 16, 16, 16, 16, 16, 20}

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.nextLine();

        String data = scan.nextLine();
        int[] elementArray = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).toArray();

        data = scan.nextLine();
        int[] frequencyArray = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> dataset = new ArrayList<Integer>();
        for (int i = 0; i < elementArray.length; i++) {
            for (int j = 0; j < frequencyArray[i]; j++) {
                dataset.add(elementArray[i]);
            }
        }

        Collections.sort(dataset);

        int[] dataArray = dataset.stream().mapToInt(i -> i).toArray();
        n = dataArray.length;

        double q1, q2, q3;
        int[] first_half;
        int[] second_half;

        if (n % 2 == 0) {
            q2 = (dataArray[(n / 2) - 1] + dataArray[(n / 2)]) / 2;
            first_half = Arrays.copyOfRange(dataArray, 0, (n / 2));
            second_half = Arrays.copyOfRange(dataArray, (n / 2), dataArray.length);

        } else {
            q2 = dataArray[(n / 2)];
            first_half = Arrays.copyOfRange(dataArray, 0, (n / 2));
            second_half = Arrays.copyOfRange(dataArray, (n / 2) + 1, dataArray.length);
        }

        n = first_half.length;
        dataArray = first_half;
        if (n % 2 == 0) {
            q1 = (dataArray[(n / 2) - 1] + dataArray[(n / 2)]) / 2;
        } else {
            q1 = dataArray[(n / 2)];
        }

        n = second_half.length;
        dataArray = second_half;
        if (n % 2 == 0) {
            q3 = (dataArray[(n / 2) - 1] + dataArray[(n / 2)]) / 2;
        } else {
            q3 = dataArray[(n / 2)];
        }

        System.out.printf("%.1f", q3 - q1);
    }
}
