import java.util.Scanner;
public class BodyMassIndexCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // define variables
        double height, weight;

        // request values from the user
        System.out.print("Please enter your height (in meters): ");
        height = input.nextDouble();
        System.out.print("Please enter your weight (in kilograms): ");
        weight = input.nextDouble();

        //calculation
        double bmc = weight / (height * height);

        System.out.println("Your body mass index: " +bmc);

    }
}
