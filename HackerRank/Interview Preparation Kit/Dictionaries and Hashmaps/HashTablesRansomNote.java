import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HashTablesRansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> wordsMap = new HashMap<>();

        for (int i = 0; i < magazine.length; i++) {
            String key = magazine[i];

            if (wordsMap.get(key) == null) {
                wordsMap.put(key, 1);
            } else {
                int currentValue = wordsMap.get(key);
                wordsMap.put(key, ++currentValue);
            }
        }

        String isComplete = "Yes";
        for (int i = 0; i < note.length; i++) {
            String key = note[i];

            if (wordsMap.get(key) != null && wordsMap.get(key) != 0) {
                int currentValue = wordsMap.get(key);
                wordsMap.put(key, --currentValue);
            } else {
                isComplete = "No";
                break;
            }
        }
        System.out.println(isComplete);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
