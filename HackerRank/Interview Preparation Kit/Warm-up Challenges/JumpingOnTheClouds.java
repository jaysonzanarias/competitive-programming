import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnTheClouds {
    static int jumpingOnClouds(int[] c) {
        int jumpCounter = 0;
        int maxJump = 2;

        for(int i=0; i<c.length - 1;) {
            if(i + maxJump < c.length && c[i + maxJump] == 0){
                i = i + maxJump;
            } else {
                i = i + maxJump - 1;                
            }
            jumpCounter++;
        }
        System.out.println(jumpCounter);
        return jumpCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        // 7
        // 0 0 1 0 0 1 0
        // Output: 4

        // 6
        // 0 0 0 0 1 0
        // Output: 3

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
