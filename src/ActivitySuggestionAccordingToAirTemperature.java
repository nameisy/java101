import java.util.Scanner;
public class ActivitySuggestionAccordingToAirTemperature {

    /* If the age is less than 10, send him to X-ray.
       Between the ages of 10 and 20, send for an MRI.
       Between the ages of 20 and 25, to the lab.
       Age over 25, blood lab.*/
    public static void main(String[] args) {

        // Defining variables.
        int age;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter age value: ");
        age = input.nextInt();

        // Directing people to rooms
        if (age < 10) {
            System.out.print("Go to an x-ray.");
        } else if (age <= 10 && age <= 30) {
            if (age <= 20) {
                System.out.println("Go to an MRI.");
            }
            if (age >= 25) {
                System.out.println("Go to the lab.");
            } else {
                System.out.println("Go to the blood lab..");
            }


        }
    }
}