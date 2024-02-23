import java.util.Scanner;

//Denotes leap years that are multiples of 4, multiples of 100, and divisible only by 400 without remainder.
public class LeapYearCalculation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Defining variables.
        int year;

        System.out.print("Enter year: ");
        year = inp.nextInt();

        // Determination of the leap year.
        if (!(year % 400 == 0)) {
            if (!(year % 100 == 0)) {
                if (year % 4 == 0) {
                    System.out.println("A leap year!");
                } else
                    System.out.println("Not a leap year!");
            } else
                System.out.println("Not a leap year!");
        } else
            System.out.println("A leap year!");
    }
}