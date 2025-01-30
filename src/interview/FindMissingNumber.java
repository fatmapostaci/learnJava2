package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5}; // 4 eksik
        System.out.println("Missing Number: " + findMissingNumber(nums, 5));
    }

    private static int findMissingNumber(int[] nums, int i) {

        Arrays.sort(nums);
        int artisMiktari=nums[1]-nums[0];
        if (nums.length != i) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[j]+artisMiktari != nums[j+1]) {
                    return nums[j]+artisMiktari;
                }
            }

        }
            return -1;
    }


}
