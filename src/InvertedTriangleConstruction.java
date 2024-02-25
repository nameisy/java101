public class InvertedTriangleConstruction {
    public static void main(String[] args) {
        int size = 10;

        // Inverted triangle
        for (int i = size - 1; i >= 1; i--) {
            // Spaces.
            for (int j = 1; j <= size - i; j++) {
            }

            // Stars.
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}