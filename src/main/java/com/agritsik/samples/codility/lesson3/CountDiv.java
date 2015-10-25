package com.agritsik.samples.codility.lesson3;

/**
 * Created by andrey on 10/25/15.
 */
public class CountDiv {


    /**
     * CountDiv
     * https://codility.com/programmers/task/count_div
     */
    public int solution(int A, int B, int K) {

        int count = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
    }

}
