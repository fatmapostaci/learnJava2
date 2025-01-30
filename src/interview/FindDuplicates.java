package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 4, 6, 8};
        findDuplicates(nums);


    }

    private static void findDuplicates(int[] nums) {

        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            newSet.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if(newSet.contains(nums[i]))
                newSet.remove(nums[i]);
        }
        System.out.println(newSet);
   }

}
