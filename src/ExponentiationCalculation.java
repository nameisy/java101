import java.util.Scanner;

// A programme that calculates the exponent with base and exponent values.
public class ExponentiationCalculation {
    public static void main(String[] args) {
        int n, k;

        // Get the n and k values from the user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        n = input.nextInt();

        System.out.print("Enter the exponent value: ");
        k = input.nextInt();

        int total = 1;

        // Calculate the exponentiation using a for loop.
        for (int i = 1; i <= k; ) {
            total *= n;
            i++;
        }
        // Print the result to the console.
        System.out.println("Result: " + total);
    }
}