package com.agritsik.samples.codility.lesson4;

import java.util.Arrays;

/**
 * Created by andrey on 10/27/15.
 */
public class Triangle {

    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {

            if (A[i] + A[i + 1] > A[i + 2]) {
                return 1;
            }

        }

        return 0;
    }
}
