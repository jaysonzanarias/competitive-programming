import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day02_Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        BigDecimal tipForMeal = new BigDecimal(meal_cost * (tip_percent / 100f)).setScale(2, RoundingMode.HALF_UP);
        BigDecimal taxForMeal = new BigDecimal(meal_cost * (tax_percent / 100f)).setScale(2, RoundingMode.HALF_UP);
        int totalCost = (int) Math.round(meal_cost + tipForMeal.doubleValue() + taxForMeal.doubleValue());

        // double tipForMeal = meal_cost * (tip_percent/100f);
        // double taxForMeal = meal_cost * (tax_percent/100f);
        // int totalCost = (int) Math.round(meal_cost + tipForMeal + taxForMeal);

        // double tipForMeal = meal_cost * tip_percent / 100;
        // double taxForMeal = meal_cost * tax_percent / 100;
        // int totalCost = (int) (meal_cost + tipForMeal + taxForMeal);

        System.out.println(totalCost);

        System.out.println("=========================");
        System.out.println("meal_cost: " + meal_cost);
        System.out.println("tip: " + tipForMeal);
        System.out.println("tax: " + taxForMeal);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // double meal_cost = 12.00;
        // int tip_percent = 20;
        // int tax_percent = 8;
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
