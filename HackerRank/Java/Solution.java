import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        // He is a very very good boy, isn't he?
        // [A-Za-z !,?._'@]+

        // Scanner scan = new Scanner(System.in);
        // String s = scan.nextLine();


        String s = "_aa.  A ".trim();
        if (s.length() > 0) {
            String[] tokens = s.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            for(String token : tokens) {
                System.out.println(token);
            }
        } else {
            System.out.println(0);
        }




        // String s = "_aa.  A ";
        
        // String regexPattern = "[ !,?._'@]+";
        // String regexPatternReplace = "^[^A-Za-z]*";
        // String replacedWith = "";

        // String test = s.replaceAll(regexPatternReplace, replacedWith);

        // System.out.println("LENGTH: " + test.length() + " | VALUE: " + test);
        // String[] stringArray = (test.length() == 0) ? new String[0] : test.split(regexPattern);
    
        // System.out.println(stringArray.length);
        // Arrays.stream(stringArray).forEach(System.out::println);
        // // scan.close();
        
        // String test1 = "_aa.  A ";
        // String test2 = "!!!";
        // String test3 = "!SSSSS";
        // String test4 = "test !   !   He is a very very good boy, isn't he? test";
        // String test5 = "       ";

        // String[] stringArray1 = test1.replaceAll(regexPatternReplace, replacedWith).length() == 0 ? new String[0] : test1.replaceAll(regexPatternReplace, replacedWith).split(regexPattern);
        // String[] stringArray2 = test2.replaceAll(regexPatternReplace, replacedWith).length() == 0 ? new String[0] : test2.replaceAll(regexPatternReplace, replacedWith).split(regexPattern);
        // String[] stringArray3 = test3.replaceAll(regexPatternReplace, replacedWith).length() == 0 ? new String[0] : test3.replaceAll(regexPatternReplace, replacedWith).split(regexPattern);
        // String[] stringArray4 = test4.replaceAll(regexPatternReplace, replacedWith).length() == 0 ? new String[0] : test4.replaceAll(regexPatternReplace, replacedWith).split(regexPattern);
        // String[] stringArray5 = test5.replaceAll(regexPatternReplace, replacedWith).length() == 0 ? new String[0] : test5.replaceAll(regexPatternReplace, replacedWith).split(regexPattern);

        // System.out.println("TEST 1: " + (stringArray1.length == 2 ? "PASS" : "FAILED (" + stringArray1.length + ")"));
        // System.out.println("TEST 2: " + (stringArray2.length == 0 ? "PASS" : "FAILED (" + stringArray2.length + ")"));
        // System.out.println("TEST 3: " + (stringArray3.length == 1 ? "PASS" : "FAILED (" + stringArray3.length + ")"));
        // System.out.println("TEST 4: " + (stringArray4.length == 12 ? "PASS" : "FAILED (" + stringArray4.length + ")"));
        // System.out.println("TEST 5: " + (stringArray5.length == 0 ? "PASS" : "FAILED (" + stringArray5.length + ")"));
    }
}

