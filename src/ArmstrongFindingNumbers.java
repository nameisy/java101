public class ArmstrongFindingNumbers {
    // The programme that calculates the sum of the digits of the number 1643.
    public static void main(String[] args) {
        int a = 1643;
        int total = 0;

        // While the number is greater than 0, the loop continues.
        while (a > 0) {

            // The remainder of the number when divided by 10 is added to the total.
            total += a % 10;

            // The number is divided by 10 to remove the last digit.
            a /= 10;
        }
        System.out.println("Total of the digits of the number: " + total);
    }
}

