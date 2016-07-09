package com.agritsik.samples.popular;

import java.util.Arrays;

public class ArraysAndSorting {

    public static int[] findDuplicates(int[] arr) {
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

    public static void duplicationInTwoArrays() {
        int[] arr1 = new int[]{1, 4, 4, 4, 5, 6, 8};
        int[] arr2 = new int[]{2, 4, 3, 6, 9, 11};

        int[] r = new int[Math.min(arr1.length, arr2.length)];

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

    }

    /**
     * Merges to arrays
     */
    public static int[] mergeTwoArrays() {

        int[] m1 = new int[]{8, 2, 4};
        int[] m2 = new int[]{3, 9, 4, 12, 9};

        Arrays.sort(m1);
        Arrays.sort(m2);

        int[] result = new int[m1.length + m2.length];

        int i = 0, j = 0, y = 0;
        while (i < m1.length && j < m2.length) {

            if (m1[i] <= m2[j]) {
                result[y++] = m1[i++];
            } else {
                result[y++] = m2[j++];
            }
        }

        while (i < m1.length) result[y++] = m1[i++];
        while (j < m2.length) result[y++] = m2[j++];

        return result;

    }
}