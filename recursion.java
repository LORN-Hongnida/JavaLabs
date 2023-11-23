public class recursion {
  // Recursive Approach
    public static int powerRecursive(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * powerRecursive(x, n - 1);
        }
    }
    // Normal Loop
    public static int powerIterative(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 5;
        int n = 4;

        int powerRecursiveResult = powerRecursive(x, n);

        int powerIterativeResult = powerIterative(x, n);

        System.out.println("Recursive power of " + x + " raised to " + n + " is " + powerRecursiveResult);

        System.out.println("Iterative power of " + x + " raised to " + n + " is " + powerIterativeResult);
    }
}   
