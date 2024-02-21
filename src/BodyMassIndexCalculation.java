import java.util.Scanner;
public class BodyMassIndexCalculation {
    public static void main(String[] args) {

        // define variables
        double height, weight;

        Scanner input = new Scanner(System.in);

        // request values from the user
        System.out.print("Please enter your height (in meters): ");
        weight = input.nextInt();
        System.out.print("Please enter your weight (in kilograms): ");
        height = input.nextInt();

        //calculation
        double bmc = weight / (height * height);

        System.out.println("Your body mass index: " +bmc);

    }
}
