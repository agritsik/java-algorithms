package com.agritsik.samples.codingbat.recursion;

/**
 * Created by andrey on 9/30/15.
 */
public class Recursion2 {


    public boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length) return target == 0;
        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
    }

}
