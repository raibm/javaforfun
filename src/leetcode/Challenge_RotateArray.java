package leetcode;

public class Challenge_RotateArray {

    public static void main(String[] arg) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 9);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Trata k maior que o tamanho do array

        // Inverte todos os elementos do array
        reverse(nums, 0, n - 1);
        // Inverte os primeiros k elementos
        reverse(nums, 0, k - 1);
        // Inverte os elementos restantes
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
//
//    public static void rotate(int[] nums, int k) {
//        k=k%nums.length;
//
//        int[] a = new int[nums.length];
//        var count = 0;
//        if (nums.length > 1 && k > 0) {
//            do {
//                for (int i = 0; i < nums.length; i++) {
//                    if (i == nums.length - 1) {
//                        a[0] = nums[i];
//                    } else {
//                        if (i + 1 < nums.length) {
//                            a[i + 1] = nums[i];
//                        }
//                    }
//                }
//                for (int i = 0; i < nums.length; i++) {
//                    nums[i] = a[i];
//                }
//                count++;
//            } while (count < k);
//        }
//    }
}
