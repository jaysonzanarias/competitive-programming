import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {

    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length())
            return false;

        boolean isAnagram = true;

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        for(int i=0; i<a.length(); i++) {
            if(aArray[i] != bArray[i]) {
                isAnagram = false;
                break;
            }
        }

        return isAnagram;
    }

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        // String a = scan.next();
        // String b = scan.next();
        // scan.close();
        String a = "anagram";
        String b = "margana";

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}