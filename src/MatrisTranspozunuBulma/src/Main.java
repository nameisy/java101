package MatrisTranspozunuBulma.src;

public class Main {
    public static void main(String[] args) {
        int fib[] = new int[10];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 0; i < 8; i++) {
            fib[i + 2] = fib[i + 1] + fib[i];
            System.out.print(fib[i] + ",");
        }
    }
}