public class LeetCode {

    public static void main(String[] args) {
        int[] array = {5, 6};
        int[] array2 = {2, 1, 9, 3, 3};
//        System.out.println(findMedianSortedArrays(array, array2));

        int[] sortedArray = sortArray(array, array2);
        System.out.println(sortedArray);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double outPut = 0;
        int length = nums1.length + nums2.length;

        for (int i = 0; i < nums1.length; i++) {
            outPut += nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            outPut += nums2[i];
        }

        return outPut / length;
    }

    public static int[] sortArray(int[] array, int[] array2) {
        int[] concatenatedArray = concatArrays(array, array2);

        for (int i = 0; i < concatenatedArray.length; i++) {
            int lowerNumber = concatenatedArray[i];
            for (int k = i + 1; k < concatenatedArray.length; k++) {
                if (concatenatedArray[k] < concatenatedArray[i]) {
                    concatenatedArray[i] = concatenatedArray[k];
                    concatenatedArray[k] = lowerNumber;
                    lowerNumber = concatenatedArray[i];
                }
            }
        }

        return concatenatedArray;
    }

    private static int[] concatArrays(int[] array, int[] array2) {
        int[] concatenatedArray = new int[array.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            concatenatedArray[i] = array[i];
        }

        for (int i = 0; i < array2.length; i++) {
            concatenatedArray[array.length + i] = array2[i];
        }

        return concatenatedArray;
    }
}

