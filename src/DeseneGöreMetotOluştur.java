import java.util.Scanner;
// Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarır.

public class DeseneGöreMetotOluştur {
    static void numara(int n1, int n) {
        // Sayı negatif veya 0 ise işlemi sonlandırır.
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");

        // Kurala göre sayıyı azaltır.
        numara(n1, n - 5);

        // Negatif veya 0 ise kurala göre sayıyı artırır.
        if (n <= 0) {
            numara(n1, n + 5);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan N sayısını alır.
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        numara(n, n);

    }

}
