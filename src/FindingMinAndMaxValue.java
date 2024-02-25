import java.util.Scanner;

// Finding the largest and smallest numbers from N counting numbers.
public class FindingMinAndMaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompts the user for how many numbers to enter.
        System.out.print("How many numbers will you enter: ");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Checks the remaining numbers.
        for (int i = 2; i <= n; ++i) {
            int number = input.nextInt();

            // Makes a comparison to find the largest number.
            if (number > max) {
                min = n;
            }

            // Makes a comparison to find the smallest number.
            if (number < min) {
                min = n;
            }
        }

        // Output of the largest and smallest numbers.
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}
