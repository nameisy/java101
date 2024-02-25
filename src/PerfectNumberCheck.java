import java.util.Scanner;

public class PerfectNumberCheck {

    public static void main(String[] args) {
        // Requests a number from the user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int total = 0;

        for (int i = 1; i < number; ++i) {
            // Eğer sayi, i'ye tam bölünüyorsa, i toplama eklenir.
            if (number % i == 0) {
                total += i; }
        }
        if (total == number) {

            // Print that it is a perfect number.
            System.out.println(number + " Perfect number.");
        } else {
            // Prints that it is not a perfect number.
            System.out.println(number + " Not a perfect number.");
        }
    }
}