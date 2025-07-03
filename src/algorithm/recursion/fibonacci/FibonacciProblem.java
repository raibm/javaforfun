package algorithm.recursion.fibonacci;

public class FibonacciProblem {
    public static void main(String[] args) {
        System.out.println(calcFibonacci(3));
    }

    private static int calcFibonacci(int value) {
        if (value == 0) {
            return 0;
        }
        if (value == 1) {
            return 1;
        }

        return calcFibonacci(value - 1) + calcFibonacci(value - 2);
    }
}
