import java.util.Scanner;

// Class pass status calculation program.
public class ClassPassStatusCalculation {
    public static void main(String[] args) {

        // defining variables.
        int math, physics, turkish, chemistry, music;
        int numberOfCourses = 5;

        Scanner input = new Scanner(System.in);

        // User enters notes.
        System.out.print("Your math grade: ");
        math = input.nextInt();
        if(math<=0 || math>100) {
            System.out.println("Invalid score!");
            math = 0;
            numberOfCourses-=1;
        }
        System.out.print("Your physics grade: ");
        physics = input.nextInt();
        if(physics<=0 || physics>100) {
            System.out.println("Invalid score!");
            physics = 0;
            numberOfCourses-=1;
        }
        System.out.print("Your turkish grade: ");
        turkish = input.nextInt();
        if(turkish<=0 || turkish>100) {
            System.out.println("Invalid score!");
            turkish = 0;
            numberOfCourses-=1;
        }
        System.out.print("Your chemistry grade: ");
        chemistry = input.nextInt();
        if(chemistry<=0 || chemistry>100) {
            System.out.println("Invalid score!");
            chemistry = 0;
            numberOfCourses-=1;
        }
        System.out.print("Your music grade: ");
        music = input.nextInt();
        if(music<=0 || music>100) {
            System.out.println("Invalid score!");
            music = 0;
            numberOfCourses-=1;
        }
        // Averaging formula.
        double avarage = (math + physics + turkish + chemistry + music) / numberOfCourses;
        if (avarage <= 55) {
            System.out.print("You failed in class.");
        }else{
            System.out.print("Conguralations. You passed the class");
        }
            System.out.print("Avarage: " + avarage);
    }
}
