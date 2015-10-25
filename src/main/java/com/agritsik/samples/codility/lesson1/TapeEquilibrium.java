package com.agritsik.samples.codility.lesson1;

/**
 * Created by andrey on 10/25/15.
 */
public class TapeEquilibrium {

    /**
     * TapeEquilibrium
     * https://codility.com/programmers/task/tape_equilibrium
     */
    public int solution(int[] A) {

        int rsum = 0, lsum = 0;
        for (int i = 0; i < A.length; i++) {
            rsum += A[i];
        }

        int diff = 0, mdiff = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            rsum -= A[i];
            lsum += A[i];

            diff = Math.abs(rsum - lsum);
            if (diff < mdiff) mdiff = diff;
        }

        return mdiff;
    }

    public static void main(String[] args) {
        int solution = new TapeEquilibrium().solution(new int[]{3, 1, 2, 4, 3});
        System.out.println(solution);
    }


}
