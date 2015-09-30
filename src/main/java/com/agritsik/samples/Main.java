package com.agritsik.samples;

import java.util.Arrays;

/**
 * Created by andrey on 9/29/15.
 */
public class Main {

    public static void main(String[] args) {


        int[] arr = {1, 4, 5, 8, 1, 9, 1, 5};

        duplication(arr);
    }

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

            if(!duplicated) System.out.println(arr[i]); // here I know all about the duplicates :)

            i++;
        }
    }
}
