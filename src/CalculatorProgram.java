import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        // Degişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        // Scanner Sınıfımızı Tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanacıdan değerleri al

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print ("Türkçe Notunuz: ");
        turkce = inp.nextInt ();

        System.out.print ("Tarih Notunuz: ");
        tarih = inp.nextInt ();

        System.out.print ("Müzik Notunuz: ");
        muzik = inp.nextInt ();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuç = toplam / 6.0 ;
        System.out.println("Ortalamanız: " + sonuç);

        //60'dan büyük ise Sınıfı Geçti, 60'dan büyük ise Sınıfta Kaldı yazacak.

        String durum = (sonuç > 60) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println("Durum: " + durum);






    }
}