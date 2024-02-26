import java.util.Scanner;
// Converting a whole number to a decimal number and converting this decimal number to a whole number.
public class TypeConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Receiving integer and decimal number input from the user.
        System.out.print("Enter the integer number: ");
        int integerNumber = input.nextInt();
        System.out.print("Enter the decimal number: ");
        double decimalNumber = input.nextDouble();


        double convertedDecimalNumber = (double) integerNumber;
        System.out.println("A whole number converted into a decimal number. " + convertedDecimalNumber);
        int convertedintegerNumber = (int) decimalNumber;
        System.out.println("A decimal number converted to a whole number: " + convertedintegerNumber);
    }
}
