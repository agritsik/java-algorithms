package com.agritsik.samples.popular;

import java.util.Arrays;

/**
 * Created by andrey on 7/21/16.
 */
public class ArrayDuplicates {

    public static int[] execute(int[] arr) {
        Arrays.sort(arr); // 1 1 1 4 5 5 8 9 9

        int[] result = new int[arr.length];
        boolean withinDuplicatedGroup = false;

        int i = 1, j = 0;
        while (i < arr.length) {

            if (arr[i] == arr[i - 1]) {
                if (i == arr.length - 1) result[j++] = arr[i - 1];
                withinDuplicatedGroup = true;

            } else {
                if (withinDuplicatedGroup) result[j++] = arr[i - 1];
                withinDuplicatedGroup = false;

            }

            i++;
        }

        return Arrays.copyOf(result, j);
    }
}
