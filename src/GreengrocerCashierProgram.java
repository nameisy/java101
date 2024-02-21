import java.util.Scanner;
public class GreengrocerCashierProgram {
    public static void main(String[] args) {

        // Creation of variables
        double pear, apple, tomatoes, banana, aubergine;
        double pearPrice = 2.14, applePrice = 3.67, tomatoesPrice = 1.11;
        double bananaPrice = 0.95, auberginePrice = 5.00, totalPrice;
        String turkishLira = " TL";

        Scanner input = new Scanner(System.in);

        // User enters vegetable values
        System.out.print("How many kilos of pears? : ");
        pear = input.nextDouble();
        System.out.print("How many kilos of apples? : ");
        apple = input.nextDouble();
        System.out.print("How many kilos of tomatoes? : " );
        tomatoes = input.nextDouble();
        System.out.print("How many kilos of bananas? : " );
        banana = input.nextDouble();
        System.out.print("How many kilos of aubergines? : ");
        aubergine = input.nextDouble();

        // Total price calculation for vegetables
        totalPrice = (pear*pearPrice) + (apple*applePrice) + (tomatoes*tomatoesPrice)
        + (banana*bananaPrice) + (aubergine*auberginePrice);
        System.out.print("Total Price: "+totalPrice + turkishLira);
    }
}