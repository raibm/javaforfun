package GoogleInterview;

public class SortArray {
    public static void main(String[] arg) {
        int[] nums = {3, 7, 1, 6, 5, 8, 2};
        sortArray(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }

    public static void sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] > nums[k]) {
                    int tempValue = nums[k];
                    nums[k] = nums[i];
                    nums[i] = tempValue;
                }
            }
        }
    }

}
