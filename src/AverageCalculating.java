import java.util.Scanner;

public class AverageCalculating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Retrieving the entered number from the user.
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Defining variables.
        int count = 0;
        int total = 0;

        // Loop from 0 to the entered number.
        for (int i = 0; i <= n; i++) {

            // Checking whether the number is exactly divided by 3 and 4.
            if (i % 3 == 0 && i % 4 == 0) {
                count++;
                total += i;
            }
        }

        // Calculating the average
        double average = (double) total / count;

        // Print the result.
        if (count > 0) {
            System.out.println("From 0 to " + n + " there is a number " + count + " exactly divisible by 3 and 4.");
            System.out.println("Averages " + average);
        } else {
            System.out.println("There are no numbers exactly divisible by 3 and 4 from 0 to " + n + ".");
        }
    }
}
