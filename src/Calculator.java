import java.util. Scanner;

// Calculator that performs simple operations
public class Calculator {
    public static void main(String[] args) {

        int n1, n2, select;

        // request value from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Selected : ");
        select = input.nextInt();

        // calculation procedures
        switch (select) {
            case 1:
                System.out.println("Add : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtract : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiply : " + (n1 * n2));
                break;
            case 4:
                System.out.println("Divide : " + (n1 / n2));
            default:
                System.out.println("You logged in incorrectly. Try Again!");
        }
    }
}