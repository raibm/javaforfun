package leetcode;

public class InfernalChallengeLeetCode {

    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 1, 1, 2,2,2,2,2,2, 3, 3, 4};
        removeDuplicates2(a);
    }

    public static int removeDuplicates(int[] nums) {
        int mark = 0;
        int previousNumber = nums[0];
        int totalNumbers = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];

            if (nums[i] == previousNumber) {
                if (mark < 2) {
                    totalNumbers++;
                    mark++;
                } else {
                    for (int k = i + 1; k < nums.length; k++) {
                        if (nums[k] > previousNumber) {
                            nums[i] = nums[k];
                            nums[k] = currentNumber;
                            mark = 1;
                            previousNumber = nums[i];
                            totalNumbers++;
                            break;
                        }
                    }
                }
            } else {
                if (nums[i] < previousNumber) {
                    if (mark < 2) {
                        for (int k = i + 1; k < nums.length; k++) {
                            if (nums[k] == previousNumber) {
                                nums[i] = nums[k];
                                nums[k] = currentNumber;
                                mark++;
                                previousNumber = nums[i];
                                totalNumbers++;
                                break;
                            } else if (nums[k] > previousNumber) {
                                nums[i] = nums[k];
                                nums[k] = currentNumber;
                                mark = 1;
                                previousNumber = nums[i];
                                totalNumbers++;
                                break;
                            }
                        }
                    } else {
                        for (int k = i + 1; k < nums.length; k++) {
                            if (nums[k] > previousNumber) {
                                nums[i] = nums[k];
                                nums[k] = currentNumber;
                                mark = 1;
                                previousNumber = nums[i];
                                totalNumbers++;
                                break;
                            }
                        }
                    }
                } else {
                    mark = 1;
                    previousNumber = nums[i];
                    totalNumbers++;
                }
            }
        }

        return totalNumbers;
    }

    public static int removeDuplicates2(int[] nums) {
        if(nums.length == 2) {
            return 2;
        }

        int totalElements = 2;

        for(int i = 2; i < nums.length; i++) {
            if(nums[totalElements -1] != nums[i] || nums[totalElements - 2] != nums[i]) {
                nums[totalElements++] = nums[i];
            }
        }

        return totalElements;
    }



}
