package com.agritsik.samples.custom;

import java.util.Arrays;

public class Duplication {

    public static void main(String[] args) {
        duplicationInArray();
        duplicationInTwoArrays();
        mergeTwoArrays();
    }

    /**
     * Find/delete duplicates from array
     */
    public static void duplicationInArray() {

        int[] arr = new int[]{1, 4, 5, 8, 1, 9, 1, 5};

        Arrays.sort(arr);

        int i = 0;
        while (i < arr.length) {

            // assume that current element doesn't have a duplicate
            boolean duplicated = false;

            // if next exists and current == next
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                duplicated = true;
                i++;
            }

            if (!duplicated) System.out.println(arr[i]); // here I know all about the duplicates :)

            i++;
        }
    }

    private static void duplicationInTwoArrays() {
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