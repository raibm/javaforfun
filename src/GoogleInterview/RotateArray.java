package GoogleInterview;

public class RotateArray {
    public static void main(String[] arg) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int numsOfRotation = 3;
        rotateArray(nums, numsOfRotation);
        for (int n : nums) {
            System.out.println(n);
        }
    }

    public static void rotateArray(int[] nums, int numsOfRotation) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, numsOfRotation - 1);
        reverse(nums, numsOfRotation, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int v1 = nums[start];
            nums[start] = nums[end];
            nums[end] = v1;
            start++;
            end--;
        }
    }
}
