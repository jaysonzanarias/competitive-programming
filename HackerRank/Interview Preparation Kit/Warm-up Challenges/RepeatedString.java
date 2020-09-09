import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        if (s.length() == 1 && s.charAt(0) == 'a') {
            return n;
        }

        long result = 0;
        long countPerS = s.chars().filter(c -> c == 'a').count();
        long numberOfAppend = n / s.length();
        result = countPerS * numberOfAppend;
        int remainingIteration = (int) (n - (numberOfAppend * s.length()));

        for(int i=0; i<remainingIteration; i++) {
            if(s.charAt(i) == 'a')
                result++;
        }

        // SLOW
        // for(int i=0, j=0; i<n; i++) {            
        //     if(j==s.length())
        //         j = 0;

        //     if(s.charAt(j) == 'a')
        //         result++;        
             
        //     j++;
        // }
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new
        FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // 7
        // String s = "aba";
        // long n = 10l;

        // String s = "ab";
        // long n = 1000000000000l;

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
