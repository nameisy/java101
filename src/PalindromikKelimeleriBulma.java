public class PalindromikKelimeleriBulma {

    // Bir kelimenin palindrom olup olmadığını kontrol eden fonksiyon
    static boolean isPalindrome(String str) {

        // Dize başlangıç ve bitiş indislerini tanımlama
        int i = 0;
        int j = str.length() - 1;

        // Dize baştan ve sondan başlayarak karşılaştırma
        while (i < j) {
            // Karakterler farklıysa palindrom değildir, döngüyü sonlandır
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            // Her iki taraftan da bir karakter ilerleme
            i++;
            j--;
        }

        // Döngü tamamlandıysa palindromdur
        return true;
    }

    // Bir kelimenin tersi alınarak palindrom olup olmadığını kontrol eden alternatif fonksiyon
    static boolean isPalindrome2(String str) {

        // Ters çevrilmiş kelimeyi oluşturmak için boş bir String değişkeni tanımlama
        String reverse = "";

        // Dize sondan başlayarak tüm karakterleri ters çevirme
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // Orijinal kelime ters çevrilmiş kelime ile aynıysa palindromdur
        if (str.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // "abba" kelimesini palindrom olup olmadığını kontrol etme
        System.out.println(isPalindrome("abba")); // true yazdırır
    }
}
