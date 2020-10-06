import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day28_Regex {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String regexPattern = "@gmail.com$";
        Pattern p = Pattern.compile(regexPattern);
        Matcher matcher;

        SortedMap<String, String> names = new TreeMap<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            matcher = p.matcher(emailID);
            if(matcher.find())
                names.put(firstName + emailID, firstName);
        }

        names.forEach((K, V) -> {
            System.out.println(V);
        });

        scanner.close();
    }
}
