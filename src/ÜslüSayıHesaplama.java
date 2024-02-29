import java.util.Scanner;
// Recursive Metotlar ile Üslü Sayı Hesaplama.
public class ÜslüSayıHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değeri giriniz: ");
            int taban = scanner.nextInt();
            System.out.print("Üs değerini giriniz: ");
            int us = scanner.nextInt();

            // Tabanın üssünün hesaplanması.
            int sonuc = üslüSayı(taban, us);
            System.out.println("Sonuç: " + sonuc);
        }
    }

    // Taban-üs hesaplaması.
    static int üslüSayı(int tabanDeğeri, int usDeğeri) {
        if (usDeğeri == 0) {
            return 1;
        } else {
            return tabanDeğeri * üslüSayı(tabanDeğeri, usDeğeri - 1);
        }
    }
}
