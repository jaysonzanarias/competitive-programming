import java.io.*;
import java.util.*;

public class Day25_RunningTimeAndComplexity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int t = 0;
        for (int i = 0; i < n; i++) {
            t = scanner.nextInt();
            System.out.println(isPrime(t));
        }
    }

    static Map<Integer, String> primeNumbers = new HashMap<>();

    static String isPrime(int t) {
        String isPrime = "Prime";

        if (primeNumbers.containsKey(t)) {
            return primeNumbers.get(t);
        } else {
            if (t == 1) {
                isPrime = "Not prime";
                primeNumbers.put(t, isPrime);
                return isPrime;
            }

            if (t == 2 || t == 3) {
                primeNumbers.put(t, isPrime);
                return isPrime;
            }

            if (t % 2 == 0) {
                isPrime = "Not prime";
                primeNumbers.put(t, isPrime);
                return isPrime;
            }

            for (int i = 3; i < t; i += 2) {
                if (t % i == 0) {
                    isPrime = "Not prime";
                    primeNumbers.put(t, isPrime);
                    return isPrime;
                }
            }

            return isPrime;
        }
    }
}