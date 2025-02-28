import java.util.*;

public class SieveOfEratosthenes {
    public static void sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1]; // Boolean array to store prime status
        Arrays.fill(primes, true); // Assume all numbers are prime initially
        primes[0] = primes[1] = false; // 0 and 1 are not prime

        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) { // If p is a prime
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false; // Mark multiples of p as non-prime
                }
            }
        }

        // Print all prime numbers
        System.out.print("Prime numbers up to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 50; // Example: Find all primes up to 50
        sieveOfEratosthenes(n);
    }
}
