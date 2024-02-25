import java.util.Scanner;

// Programme that finds harmonic numbers.
public class FindingHarmonicNumbers {
    public static void main(String[] args) {

        // Requests a value from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = input.nextInt();
        double result = 0.0;
        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println(result);

    }
}
