import java.util.Scanner;
// The programme that prints the powers of 4 and 5 up to the entered number on the screen.
public class FindingForcesOf4And5 {
    public static void main(String[] args) {

        // Variable for user.
        int number;

        // Get the number from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Print the powers of 4
        System.out.println("\nPowers of 4: ");
        for (int i = 1; i <= n; i *= 4)
            System.out.println(i + "");

        // Print the powers of 4
        System.out.println("\nPowers of 5: ");
        for (int i = 1; i <= n; i *= 5)
            System.out.println(i + "");

    }
}
