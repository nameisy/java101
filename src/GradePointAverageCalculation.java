import java.util.Scanner;

public class GradePointAverageCalculation {
    public static void main(String[] args) {
        // Degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;
        // Scanner Sınıfımızı Tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanacidan degerleri al

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
        double sonuc = toplam / 6.0 ;
        System.out.println("Ortalaman1z: " + sonuc);




    }
}