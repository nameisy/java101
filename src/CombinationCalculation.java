public class CombinationCalculation {
// This program calculates combinations using a while loop.

/* N is the number of elements in the set.
   r is the number of elements in each group.
   C(n,r) is the number of distinct groups of r elements that can be formed from a set of n elements.*/
    public static void main(String[] args) {
        // Define the values of n and r.
        int n = 5;
        int r = 3;

        // Variable to store the combination.
        int combination = 1;

        // Loop control variable.
        int i = 1;

        // While loop to calculate the factorial of n.
        int factorialN = 1;
        while (i <= n) {
            factorialN *= i;
            i++;
        }

        // While loop to calculate the factorial of r.
        i = 1;
        int factorialR = 1;
        while (i <= r) {
            factorialR *= i;
            i++;
        }

        // While loop to calculate the factorial of (n-r).
        i = 1;
        int factorialNR = 1;
        while (i <= n - r) {
            factorialNR *= i;
            i++;
        }

        // Calculate the combination.
        combination = factorialN / (factorialR * factorialNR);

        // Print the result to the console.
        System.out.println(n + " element set " + r + " element distinct groups count (C(" + n + "," + r + ") ): " + combination);
    }
}
