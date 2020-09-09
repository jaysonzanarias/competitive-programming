import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length())
            return false;

        boolean isAnagram = true;

        Map<Character, Integer> frequencyA = getFrequency(a);
        Map<Character, Integer> frequencyB = getFrequency(b);

        for (char key : frequencyA.keySet()) {
            if(frequencyA.get(key) != frequencyB.get(key)){
                isAnagram = false;
                break;
            }
        }

        return isAnagram;
    }

    static Map<Character, Integer> getFrequency(String s) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (frequency.get(key) == null) {
                frequency.put(key, 1);
            } else {
                int count = Integer.parseInt(frequency.get(key).toString());
                frequency.put(key, count + 1);
            }
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);

        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}