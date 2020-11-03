import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Map<Character, Integer> mapA = new HashMap<Character, Integer>();
        Map<Character, Integer> mapB = new HashMap<Character, Integer>();

        for (int i = 0; i < aArray.length; i++) {
            if (mapA.get(aArray[i]) == null)
                mapA.put(aArray[i], 1);
            else
                mapA.put(aArray[i], mapA.get(aArray[i]) + 1);
        }

        for (int i = 0; i < bArray.length; i++) {
            if (mapB.get(bArray[i]) == null)
                mapB.put(bArray[i], 1);
            else
                mapB.put(bArray[i], mapB.get(bArray[i]) + 1);
        }

        int counter = 0;
        for (Map.Entry<Character, Integer> entry : mapA.entrySet()) {
            if (mapB.get(entry.getKey()) == null) {
                counter += entry.getValue();
            } else if (entry.getValue() != mapB.get(entry.getKey())) {
                counter += Math.abs(entry.getValue() - mapB.get(entry.getKey()));
            }
            mapB.remove(entry.getKey());
        }

        for (Map.Entry<Character, Integer> entry : mapB.entrySet()) {
            counter += entry.getValue();
        }

        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new
        FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        System.out.println(res);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
