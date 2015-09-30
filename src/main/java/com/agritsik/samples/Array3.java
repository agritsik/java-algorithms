package com.agritsik.samples;

/**
 * Created by andrey on 9/30/15.
 */
public class Array3 {


    /*
        Consider the leftmost and righmost appearances of some value in an array.
        We'll say that the "span" is the number of elements between the two inclusive.
        A single value has a span of 1. Returns the largest span found in the given array.
        (Efficiency is not a priority.)

        maxSpan({1, 2, 1, 1, 3}) → 4
        maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
        maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6
    */
    public int maxSpan(int[] nums) {
        if (nums.length == 0) return 0;

        int interval = 1;
        int i = 0;
        while (i < nums.length) {

            int j = nums.length - 1;
            while (j >= i) {
                if (nums[i] == nums[j] && j - i + 1 > interval) {
                    interval = j - i + 1;
                }
                j--;
            }
            i++;
        }

        return interval;
    }


    /*
        Given a non-empty array, return true if there is a place
        to split the array so that the sum of the numbers on one side is equal
        to the sum of the numbers on the other side.

        canBalance({1, 1, 1, 2, 1}) → true
        canBalance({2, 1, 1, 2, 1}) → false
        canBalance({10, 10}) → true
    */
    public boolean canBalance(int[] nums) {
        boolean result = false;

        int sumLeft = 0, sumRight = 0;
        for (int j = 0; j < nums.length; j++) {
            sumRight += nums[j];
        }

        int i = 0;
        while (i < nums.length) {
            sumLeft += nums[i];
            sumRight -= nums[i];
            if (sumLeft == sumRight) {
                result = true;
                break;
            }
            i++;
        }

        return result;
    }


}
