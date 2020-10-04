import java.util.*;

public class Day26_NestedLogic {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);

        int[] actualReturnedDate = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] expectedReturnedDate = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int fine = 0;

        if (actualReturnedDate[2] > expectedReturnedDate[2]) {
            fine = 10000;
        } else if (actualReturnedDate[1] > expectedReturnedDate[1] && actualReturnedDate[2] == expectedReturnedDate[2]) {
            fine = 500 * (actualReturnedDate[1] - expectedReturnedDate[1]);
        } else if (actualReturnedDate[0] > expectedReturnedDate[0] && actualReturnedDate[1] == expectedReturnedDate[1]) {
            fine = 15 * (actualReturnedDate[0] - expectedReturnedDate[0]);
        }

        System.out.println(fine);
        scanner.close();
    }
}