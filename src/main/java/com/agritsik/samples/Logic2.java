package com.agritsik.samples;

import java.util.Arrays;

/**
 * Created by andrey on 9/29/15.
 */
public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        // todo:
        return false;
    }

    public int loneSum(int a, int b, int c) {
        int result = 0;

        int[] arr = {a, b, c};
        Arrays.sort(arr);

        int i = 0;
        while (i < arr.length) {

            boolean duplicated = false;

            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                duplicated = true;
                i++;
            }

            if (!duplicated) result += arr[i];

            i++;
        }


        return result;
    }

    public int luckySum(int a, int b, int c) {

        int[] arr = {a, b, c};

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) break;
            result += arr[i];
        }

        return result;
    }

}