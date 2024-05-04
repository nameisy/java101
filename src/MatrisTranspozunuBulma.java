public class MatrisTranspozunuBulma {

    //Matris Transpozunu Bulma.
    public static void MatrisTranspozunuBulma(String[] args) {

        // Matrisi tanımlıyoruz.
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Matrisin transpozunu tanımlıyoruz.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

}