import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokens {

    public static void main(String[] args) {
        // He is a very very good boy, isn't he?
        // [A-Za-z !,?._'@]+

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // String test0 = "He is a very very good boy, isn't he?";
        // String test1 = "_aa. A ";
        // String test2 = "!!!";
        // String test3 = "!SSSSS";
        // String test4 = "test ! ! He is a very very good boy, isn't he? test";
        // String test5 = " ";

        String regexPattern = "[ !,?._'@]+";
        String regexPatternReplace = "^[^A-Za-z]*";
        String replacedWith = "";

        String tempString = s.replaceAll(regexPatternReplace, replacedWith);

        String[] stringArray = (tempString.length() == 0) ? new String[0] : tempString.split(regexPattern);

        System.out.println(stringArray.length);
        Arrays.stream(stringArray).forEach(System.out::println);

        scan.close();
    }
}
