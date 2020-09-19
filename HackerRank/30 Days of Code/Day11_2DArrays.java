import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11_2DArrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int largestSum = -63;
        for (int rowI = 0; rowI <= 3; rowI++) {
            int tempSum = 0;

            for (int colI = 0; colI <= 3; colI++) {
                tempSum = arr[rowI + 0][colI] + arr[rowI + 0][colI + 1] + arr[rowI + 0][colI + 2]
                        + arr[rowI + 1][colI + 1] + arr[rowI + 2][colI] + arr[rowI + 2][colI + 1]
                        + arr[rowI + 2][colI + 2];

                if (tempSum >= largestSum)
                    largestSum = tempSum;
            }
        }

        System.out.println(largestSum);

        scanner.close();
    }
}
