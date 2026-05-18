package GoogleInterview;

/**
 * A ideia é espelhar um array, seguindo o exemplo:
 * [1,2,3,4,5,6,7]
 * [7,6,5,4,3,2,1]
 */
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
            int tempStartPosition = nums[firstIndex];
            int tempEndPosition = nums[lastIndex];
            nums[firstIndex] = tempEndPosition;
            nums[lastIndex] = tempStartPosition;
            firstIndex++;
            lastIndex--;
        }
    }

}
