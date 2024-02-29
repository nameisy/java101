import java.util.Scanner;

// Bir sayının asal olup olmadığını kontrol etme.
public class AsalSayıBulma {

    static boolean asalSayi(int sayi, int bolen) {
        // Eğer sayı 1'e eşitse asal değildir
        if (sayi == 1) {
            return false;
        }
        // Eğer bölen sayının kareköküne eşitse ve kalan 0'sa asal değildir
        else if (bolen * bolen == sayi) {
            return false;
        }
        // Eğer kalan 0'sa asal değildir
        else if (sayi % bolen == 0) {
            return false;
        }
        // Eğer sayı 1'den büyük ve kalan 0 değilse
        else {
            // Bir sonraki bölen için fonksiyonu tekrar çağır
            return asalSayi(sayi, bolen + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Kullanıcıdan sayıyı alır.
            System.out.print("Sayı Giriniz: ");
            int sayi = scanner.nextInt();

            // Asal olup olmadığını kontrol eder.
            boolean asal = asalSayi(sayi, 2);

            // Sonucu ekrana yazdırır.
            if (asal) {
                System.out.println(sayi + " sayısı ASALDIR !");
            } else {
                System.out.println(sayi + " sayısı ASAL değildir !");
            }

        }
    }
}