package com.agritsik.samples;

import java.util.Arrays;

/**
 * Created by andrey on 9/30/15.
 */
public class Array2 {

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
    }


    public int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int[] ints = Arrays.copyOfRange(nums, 1, nums.length - 1);

        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }

        return sum / ints.length;
    }

}
