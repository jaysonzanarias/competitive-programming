import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        int difference = 0;

        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 1; j < elements.length; j++) {
                difference = Math.abs(elements[i] - elements[j]);

                if(difference > maximumDifference)
                    maximumDifference = difference;
            }
        }
    }

} // End of Difference class

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}