package com.agritsik.samples.popular;

import java.util.Arrays;

/**
 * Created by andrey on 7/21/16.
 */
public class ArrayContains {

    public static boolean execute(int[] outer, int[] inner) {
        Arrays.sort(outer);
        Arrays.sort(inner);

        boolean contains = true;
        int i = 0, j = 0;
        while (i < inner.length && j < outer.length) {


            // we can't skip elements in inner array
            if (inner[i] < outer[j]) {
                contains = false;
                break;
            }

            if (inner[i] > outer[j]) {
                j++;
            } else {
                i++;
                j++;
            }

        }

        return contains;
    }
}
