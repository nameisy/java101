import java.util.Scanner;

public class ÖğrenciBilgiSistemi {
    public static void main(String[] args) {

        int mat, fizik, turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("mat: ");
        mat = input.nextInt();

        System.out.print("fizik: ");
        fizik = input.nextInt();

        System.out.print("turkce: ");
        turkce = input.nextInt();

        double ortalama = (mat + fizik+ turkce) / 3;
        if (ortalama <= 0 && ortalama >= 100);







    }
}
