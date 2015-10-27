package com.agritsik.samples.codility.lesson4;

import java.util.Arrays;

/**
 * Created by andrey on 10/27/15.
 */
public class Distinct {

    public int solution(int[] A) {
        Arrays.sort(A);

        int r = 0, i = 0;
        while (i < A.length) {

            boolean d = false;

            while (i < A.length-1 && A[i] == A[i + 1]) {
                d = true;
                i++;
            }

            r++;
            i++;

        }
        return r;
    }

}
