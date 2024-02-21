import java.util.Scanner;

public class CalculatingTheAreaAndPerimeter {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin alani: " + cevre);


        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        int a = input.nextInt();
        double alanAçı = (pi * (r * r) * a) / 360;
        System.out.println("Daire diliminin alanı: " + alanAçı);
    }
}