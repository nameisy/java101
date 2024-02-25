public class PrimeNumbersBetween1And100 {

    // Prime Numbers between 1 and 100.
    public static void main(String[] args) {

        for (int i = 2; i <= 100; ++i) {
            // Checking prime numbers.
            int primeNumber = 0;

            // Checking numbers.
            for (int j = 1; j <= i; ++j) {
                if (i % j == 0) {
                    primeNumber++;
                }
            }
            // Print all prime numbers.
            if (primeNumber == 2) {
                System.out.print(i + " ");
            }
        }
    }
}