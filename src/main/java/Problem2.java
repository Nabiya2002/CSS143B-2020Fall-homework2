/**
 *  This is a two-pointer technique. i scans the entire array and j is incremented if the number at the ith location
 *  does not match the number of the jth location. f the number at the ith location matches the number of the jth
 *  location then a swap will not be performed. Then a swap is performed to change the location of the values in the
 *  array. After exiting from the for-loop, j + 1 is returned.
 *
 *  Author: Nabiya Alam
 *  Version: 1.0.0
 *  Date: 10/17/2020
 */

public class Problem2 {
    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {

        int j = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[j]) {
                j++;
                // swapping values if nums[i] is not equal to nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return j + 1;
    }
}
