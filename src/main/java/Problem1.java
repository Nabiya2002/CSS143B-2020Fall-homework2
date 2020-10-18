/**
 * The code orders the the array so that all the 0s are on the left, the 1s are in the middle, and the 2s are at
 * the end of the array. It only requires one pass to order the array. The values are swapped based on the
 * required position for each value. If the array value at the index is equal to 0, then the index and left variable
 * increase by 1. If ray value at the index is equal to 2, then the right variable is decreased by 1.
 *
 *  Author: Nabiya Alam
 *  Version: 1.0.0
 *  Date: 10/17/2020
 */

public class Problem1 {

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int index = 0;

        while (right >= left && index <= right) {
            // 0s should be in the beginning of the array
            if (nums[index] == 0) {
                nums[index] = nums[left];
                nums[left] = 0;
                left++;
                index++;
                // 2s should be in the end of the array
            } else if (nums[index] == 2) {
                nums[index] = nums[right];
                nums[right] = 2;
                right--;

            } else {
                index++;
            }
        }
    }
}
