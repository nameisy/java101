import java.util.Scanner;
public class CalculateToArea {

    public static void main(String[] args) {
        //Değişkenlerimizi oluşturalım
        int a, b, c;
        int cevre, u;
        double alan;


        //Kullanıcıdan verilerimizi alalım
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenarı giriniz: ");
        a = girdi.nextInt();
        System.out.print("2.Kenarı giriniz: ");
        b = girdi.nextInt();
        System.out.print("3.Kenarı giriniz: ");
        c = girdi.nextInt();

        //Çevre hesabını yapalım
        cevre = a + b + c;
        u = cevre / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Alan: " + alan);
    }
}