package leetcode;

public class Challenge_SortArray {

    public static void main(String[] args) {
        int [] array1 = {1,2,3,0,0,0};
        int m = 3;
        int [] array2 = {2,5,6};
        int n = 3;

        merge(array1, m, array2, n);
        for(int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            nums1[m+i] = nums2[i];
        }

        for(int i = 0; i < nums1.length; i++) {
            int lowerNumber = nums1[i];
            for(int k = i + 1; k < nums1.length; k++){
                if(nums1[k] < nums1[i]){
                    nums1[i] = nums1[k];
                    nums1[k] = lowerNumber;
                    lowerNumber = nums1[i];
                }
            }
        }
    }
}