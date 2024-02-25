public class MakingTrianglesWithStars {
    public static void main(String[] args) {
        int size = 5;

        // Upper triangle.
        for (int i = 1; i <= size; i++) {
            // Spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // Stars.
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower triangle.
        for (int i = size - 1; i >= 1; i--) {
            // Spaces.
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // Stars.
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}