package com.agritsik.samples;

/**
 * Created by andrey on 9/30/15.
 */
public class Array3 {

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
