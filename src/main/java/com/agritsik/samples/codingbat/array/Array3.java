package com.agritsik.samples.codingbat.array;

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


    public int[] fix34(int[] nums) {

        int i = 0, j = 0, tmp = 0;
        while (i < nums.length) {

            if (nums[i] == 3) {
                while (j < nums.length) {

                    if (nums[j] == 4 && nums[j - 1] != 3) { // do swap
                        tmp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j++] = tmp;
                        break;
                    }
                    j++;
                }
            }

            i++;

        }
        return nums;
    }

    /*
        Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
        (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
        which is known to sum to exactly n*(n + 1)/2.
        seriesUp(3) → {1, 1, 2, 1, 2, 3}
        seriesUp(4) → {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
        seriesUp(2) → {1, 1, 2}

        seriesUp(4) → {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}

         */
    public int[] seriesUp(int n) {

        int[] r = new int[n * (n + 1) / 2];

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                r[k++] = j+1;
            }
        }

        return r;
    }

}
