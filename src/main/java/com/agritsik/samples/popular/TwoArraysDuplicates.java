package com.agritsik.samples.popular;

import java.util.Arrays;

/**
 * Created by andrey on 7/21/16.
 */
public class TwoArraysDuplicates {

    public static int[] execute(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] result = new int[Math.min(arr1.length, arr2.length)];

        int i = 0, j = 0, y = 0;
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                result[y++] = arr1[i];
                i++;
                j++;
            }
        }

        return Arrays.copyOf(result, y);

    }
}
