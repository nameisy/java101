// Java kütüphanelerini içe aktarma

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayıTahminOyunu {

    public static void main(String[] args) {

        // Rastgele sayı üretmek için Random nesnesi oluşturma
        Random rand = new Random();

        // 0 ile 100 arasında rastgele bir sayı üretme
        int number = rand.nextInt(100);

        // Alternatif olarak, Math.random kullanılabilir
        // int number = (int) (Math.random() * 100);

        // Kullanıcıdan veri okumak için Scanner nesnesi oluşturma
        Scanner input = new Scanner(System.in);

        // Doğru tahmin sayısını takip etmek için değişken
        int right = 0;

        // Kullanıcının tahmin ettiği sayıyı saklamak için değişken
        int selected;

        // Yanlış tahminleri saklamak için dizi
        int[] wrong = new int[5];

        // Kazanma durumunu takip etmek için değişken
        boolean isWin = false;

        // Hatalı giriş kontrolü için değişken
        boolean isWrong = false;

        // Bir satır boşluk yazdırma
        System.out.println();

        // 5 tahmin hakkı dolana kadar döngü devam eder
        while (right < 5) {

            // Kullanıcıdan tahminini girmesini isteme
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            // Tahminin 0-100 arasında olup olmadığını kontrol etme
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");

                // Hatalı giriş sayısını kontrol etme
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }

                // Hatalı girişlerde döngünün başına dönme
                continue;
            }

            // Tahmin doğruysa
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            } else {
                // Tahmin yanlışsa
                System.out.println("Hatalı bir sayı girdiniz !");

                // Tahminin gizli sayıdan büyük veya küçük olduğunu belirleme
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                // Yanlış tahmini diziye kaydetme
                wrong[right++] = selected;

                // Kalan tahmin hakkını gösterme
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }

        // Kazanma durumuna göre mesaj gösterme
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");

            // Hatalı giriş yapılmadıysa yanlış tahminleri gösterme
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}
