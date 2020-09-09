import java.util.Scanner;

public class Anagram3 {

    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length())
            return false;

        boolean isAnagram = true;

        char[] aArray = a.toUpperCase().toCharArray();
        char[] bArray = b.toUpperCase().toCharArray();

        for(int i=0; i<aArray.length; i++) {
            int countA = 0;
            int countB = 0;

            char toCompare = aArray[i];

            for(int j=0; j<aArray.length; j++) {
                if(toCompare == aArray[j]) 
                    countA++;
                
                if(toCompare == bArray[j]) 
                    countB++;
            }

            if(countA != countB) {
                isAnagram = false;
                break;
            }
        }

        return isAnagram;
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