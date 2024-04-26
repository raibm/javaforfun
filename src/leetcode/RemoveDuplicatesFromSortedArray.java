package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,2};

        removeDuplicates(nums);
        System.out.println(nums);
    }
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int previousNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            for(int k = i; k < nums.length; k++) {
                if( i == 0) {
                    previousNumber = nums[i];
                    count++;
                    break;
                }
                if(previousNumber < nums[k]) {
                    nums[i] = nums[k];
                    previousNumber = nums[i];
                    count++;
                    break;
                }
            }
        }

        for(int i = count; i < nums.length; i ++) {
            nums[i] = 0;
        }
        return count;
    }

}
