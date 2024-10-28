package GoogleInterview;

public class MirrorArray {
    public static void main(String[] arg) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        mirrorArray(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }

    public static void mirrorArray(int[] nums) {
        int firstIndex = 0;
        int lastIndex = nums.length - 1;
        while (firstIndex < lastIndex) {
            int v1 = nums[firstIndex];
            int v2 = nums[lastIndex];
            nums[firstIndex] = v2;
            nums[lastIndex] = v1;
            firstIndex++;
            lastIndex--;
        }
    }

}
