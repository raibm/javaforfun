package algorithm.recursion.fibonacci;

import java.util.HashMap;

public class FibonacciProblem {
    private static HashMap<Integer, Integer> processedValues = new HashMap<>();

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        System.out.println("result: " + calcFibonacciMemoization(45) +
                "\nEstimate execution time: " + ((System.currentTimeMillis() - startTime) / 1000));
    }

    /**
     * Complexidade dessa versão
     * É O(2^n) — exponencial
     * Ela explode rapidamente conforme n cresce.
     * Por isso, precisamos otimizar
     *
     * @param value
     * @return
     */
    private static int calcFibonacci(int value) {
        if (value == 0) {
            return 0;
        }
        if (value == 1) {
            return 1;
        }
        return calcFibonacci(value - 1) + calcFibonacci(value - 2);
    }

    /**
     * Complexidade dessa versão
     * É O(n) — linear
     * Será sempre proporcional ao tamanho de n, não recalculando valores
     * @param value
     * @return
     */
    private static int calcFibonacciMemoization(int value) {
        if (value == 0) {
            return 0;
        }
        if (value == 1) {
            return 1;
        }
        if (processedValues.containsKey(value)) {
            return processedValues.get(value);
        }
        int result = calcFibonacciMemoization(value - 1) + calcFibonacciMemoization(value - 2);
        processedValues.put(value, result);
        return result;
    }
}
