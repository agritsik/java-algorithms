package com.agritsik.samples.codility.lesson4;

import java.util.Arrays;

/**
 * Created by andrey on 10/27/15.
 */
public class MaxProductOfThree {

    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        return A[A.length-1]*A[A.length-2]*A[A.length-3];

    }

}
