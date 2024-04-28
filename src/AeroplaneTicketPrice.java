import java.util.Scanner;

//A programme that calculates the air ticket price according to the distance and conditions.
public class Main {
    public static void main(String[] args) {

        // Defining variables.
        int age, distance, tripType;
        double price;

        Scanner input = new Scanner(System.in);

        //It asks the user for distance, age and journey type.
        System.out.print("Enter the distance (in km): ");
        distance = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter the trip type (1 => One Way, 2 => Round Trip): ");
        tripType = input.nextInt();

        // Calculation of the price according to the information provided.
        if (distance > 0 && age > 0 && (tripType == 1 || tripType == 2)) {

            price = distance * 0.10;
            double discount, tipDiscount;

            if (age < 12) {
                discount = price * 0.5;
                price = price - discount;
            } else if (age > 12 && age <= 24) {
                discount = price * 0.1;
                price = price - discount;
            } else if (age >= 65) {
                discount = price * 0.3;
                price = price - discount;
            }
            if (tripType == 2) {
                tipDiscount = price * 0.2;
                price = (price - tipDiscount) * 2;
            }
            System.out.println("Total Amount is: " + price + " TL");

        } else {
            System.out.println("You Entered Incorrect Data!");
        }
    }
}