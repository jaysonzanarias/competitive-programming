import java.io.*;
import java.util.*;

public class Day06_Review {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        String toTest = "";
        String even = "";
        String odd = "";
        while (s.hasNext()) {
            toTest = s.nextLine();

            for (int i = 0; i < toTest.length(); i++) {
                if (i % 2 == 0)
                    even += toTest.charAt(i);
                else
                    odd += toTest.charAt(i);
            }

            System.out.println(even + " " + odd);
            even = "";
            odd = "";
        }
    }
}