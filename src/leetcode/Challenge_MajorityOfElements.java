package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Challenge_MajorityOfElements {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 7, 7, 3, 5, 7, 9, 6, 7, 7, 7, 4, 1, 5};

        majorityElement(nums);
    }

    public static int majorityElement(int[] nums) {
        int majorNumber = 0;
        int previousValue = 0;

        HashMap<Integer, Integer> mapped = new HashMap<>();
        for (int num : nums) {
            if (mapped.containsKey(num)) {
                mapped.put(num, mapped.get(num) + 1);
            } else {
                mapped.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> m : mapped.entrySet()) {
            if (m.getValue() > previousValue) {
                previousValue = m.getValue();
                majorNumber = m.getKey();
            }
        }

        return majorNumber;
    }
}
