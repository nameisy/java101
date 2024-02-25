import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements of the Fibonacci series: ");
        int elementNumber = input.nextInt();

        int a = 0, b = 1, c;

        for (int i = 1; i <= elementNumber; ++i) {
            if (i == 1) {
                System.out.print(a + " ");
            } else if (i == 2) {
                System.out.print(b + " ");
            } else {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}