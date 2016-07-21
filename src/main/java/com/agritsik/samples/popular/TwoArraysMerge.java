package com.agritsik.samples.popular;

import java.util.Arrays;

/**
 * Created by andrey on 7/21/16.
 */
public class TwoArraysMerge {


    /**
     * Merges to arrays
     */
    public static int[] execute(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, y = 0;
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                result[y++] = arr1[i++];
            } else {
                result[y++] = arr2[j++];
            }
        }

        while (i < arr1.length) result[y++] = arr1[i++];
        while (j < arr2.length) result[y++] = arr2[j++];

        return result;
    }
}
