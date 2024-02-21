import java.util.Scanner;
public class TaximeterCalculation {
    public static void main(String[] args) {
    int km;
    double perKm = 2.20, total = 10;

    Scanner input = new Scanner (System.in);
    System.out.print("KM cinsinden mesafeyi Giriniz: ");
    km = input.nextInt();

    total += km * perKm;
    //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır
    total = (total < 20) ? 20 : total;
    System.out.println("Toplam Tutar: " + total);

    }
}
