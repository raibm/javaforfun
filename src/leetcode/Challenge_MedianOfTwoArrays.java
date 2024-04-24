package leetcode;

public class Challenge_MedianOfTwoArrays {

    public static void main(String[] args) {
        int[] array = {1, 2};
        int[] array2 = {3, 3};
        int[] sortedArray = sortArray(array, array2);

        System.out.println("The median is: " + findMedianIntoSortedArray(sortedArray));
    }

    public static double findMedianIntoSortedArray(int[] sortedArray) {
        double outPut = 0;

        if (sortedArray.length % 2 != 0) {
            for (int i = 0; i < sortedArray.length; i++) {
                outPut += sortedArray[i];
            }
            outPut = sortedArray[sortedArray.length/2];
        } else {
            double value1 = sortedArray[sortedArray.length / 2 - (1)];
            double value2 = sortedArray[sortedArray.length / 2];
            outPut = ((value1 + value2) / 2);
        }

        return outPut;
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

