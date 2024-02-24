import java.util.Scanner;

/*A programme that accepts input from the user until an additional number is entered,
  adds the numbers that are even and multiples of 4 from the entered values and
  prints them on the screen.*/
public class TotalOfEvenAndMultiplesOf4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable to store the total.
        int total = 0;

        // Loop until a single number is entered.
        while (true) {
            System.out.print("Enter a number (enter -1 to exit): ");
            int number = scanner.nextInt();

            // Exit the loop if -1 is entered.
            if (number == -1) {
                break;
            }

            // Check if the number is even and a multiple of 4.
            if (number % 2 == 0 && number % 4 == 0) {
                total += number; // Add the number to the total.
            }
        }

        // Print the result
        System.out.println("Total: " + total);
    }
}