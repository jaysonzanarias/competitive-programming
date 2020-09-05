import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
	public static void main(String[] args){
        // 3
        // ([A-Z])(.+)
        // [AZ[a-z](a-z)
        // batcatpat(nat

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            try {
			    String pattern = in.nextLine();
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
		}
	}
}



