import java.util.Scanner;

public class SortingNumbersFromLargerToSmaller {
    // Sorting numbers from larger to smaller program.
    public static void main(String[] args) {

        // Defining variables.
        int a, b, c;

        Scanner input = new Scanner(System.in);

        //Getting numer from the user.
        System.out.print ("Number 1:");
        a = input.nextInt ();

        System.out.print ("Number 2:");
        b = input.nextInt ();

        System.out.print ("Number 3:");
        c = input.nextInt ();

        // Formula for sortingn numbers from largest to smallest.
        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b> c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else if ((c > b) && (c > a)) {
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }
    }
}
