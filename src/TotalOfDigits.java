import java.util.Scanner;

public class TotalOfDigits {
    public static void main(String[] args) {
        int gün;

        Scanner input = new Scanner(System.in);
        System.out.print("Günü girin: ");
        gün = input.nextInt();



        switch (gün) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            // Diğer günler için case blokları eklenir
            default:
                System.out.println("Geçersiz gün");
        }
    }
}
