import java.util.Scanner;

public class FindingEbobEkok {

    // Finding EBOB and EKOK of the entered numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the smallest and largest number
        System.out.print("Enter the smallest number: ");
        int enKucukSayi = input.nextInt();
        System.out.print("Enter the largest number: ");
        int enBuyukSayi = input.nextInt();

        int ebob = 1;
        int i = 1;

        while (i <= enKucukSayi) {
            if (enKucukSayi % i == 0 && enBuyukSayi % i == 0) {
                System.out.println(i);
                ebob = i;
            }
            i++;
        }
        int ekok = (enKucukSayi * enBuyukSayi) / ebob;
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
