package leetcode;

public class Challenge_RotateArray {

    public static void main(String[] arg) {
        int[] nums = {1, 2};
        rotate(nums, 3);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        var count = 0;
        if (nums.length > 1 && k > 0) {
            do {
                for (int i = 0; i < nums.length; i++) {
                    if (i == nums.length - 1) {
                        a[0] = nums[i];
                    } else {
                        if (i + 1 < nums.length) {
                            a[i + 1] = nums[i];
                        }
                    }
                }
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = a[i];
                }
                count++;
            } while (count < k);
        }
    }
}
