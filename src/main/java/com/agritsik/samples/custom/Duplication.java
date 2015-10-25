package com.agritsik.samples.custom;

import java.util.Arrays;

/**
 * Created by andrey on 9/29/15.
 */
public class Duplication {

    public static void main(String[] args) {

//        duplication(new int[]{1, 4, 5, 8, 1, 9, 1, 5});
//        duplication2(new int[]{1, 4, 4, 4, 5, 6, 8}, new int[]{2, 4, 3, 6, 9, 11});
//        merge(new int[]{8, 2, 4}, new int[]{3, 9, 4, 12, 9});

    }

    /**
     * Find/delete duplicates from array
     *
     * @param arr
     */
    public static void duplication(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

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

    private static void duplication2(int[] arr1, int[] arr2) {

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
     *
     * @param m1
     * @param m2
     * @return
     */
    public static int[] merge(int[] m1, int[] m2) {

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