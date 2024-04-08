import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(func(n));
    }

    /**
     * This method determines if a given number is prime or composite.
     *
     * @param n The integer to check for primality.
     * @return "Prime" if the number is prime, "Composite" otherwise.
     */

    public static String func(int n) {
        // Numbers less than or equal to 1 are composite by definition
        if (n <= 1) {
            return "Composite";
        }
        // 2 and 3 are prime by definition
        if (n <= 3) {
            return "Prime";
        }
        // Eliminate multiples of 2 and 3 efficiently
        if (n % 2 == 0 || n % 3 == 0) {
            return "Composite";
        }
        // Optimized loop to check divisibility for odd numbers greater than 3
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return "Composite";
            }
        }
        // If no divisors found, the number must be prime
        return "Prime";
    }
}