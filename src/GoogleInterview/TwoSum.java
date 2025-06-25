package GoogleInterview;

import java.util.HashMap;

/**
 * Encontre as duas posições do array que somadas equivalem ao valor buscado
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] values = {3, 8, 1, 9, 29, 7, 4, 2, 6, 14, 5, 7};
        int target = 7;
        twoSum2(values, target);
    }

    /**
     * Solução O(n²);
     * Para cada elemento do array, você percorre todos os seguintes.
     * Isso funciona bem com poucos elementos, mas fica lento com milhares.
     */
    public static void twoSum(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            for (int k = i + 1; k < values.length; k++) {
                if (values[i] + values[k] == target) {
                    System.out.println("Posições: " + i + ", " + k + "; Soma: " + values[i] + "+" + values[k] + " = " + target);
                    return;
                }
            }
        }
    }

    /**
     * Solução O(n);
     * Para cada número x, verificar se target - x já foi visto antes.
     */
    public static void twoSum2(int[] values, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            int complement = target - values[i];

            if (hashMap.containsKey(complement)) {
                System.out.println("Posições: " + i + ", " + hashMap.get(complement) + "; Soma: " + values[i] + "+" + complement + " = " + target);
                return;
            }
            hashMap.put(values[i], i);
        }
    }
}
