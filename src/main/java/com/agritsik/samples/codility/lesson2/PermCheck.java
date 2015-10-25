package com.agritsik.samples.codility.lesson2;

/**
 * Created by andrey on 10/25/15.
 */
public class PermCheck {


    /**
     * PermCheck
     * https://codility.com/programmers/task/perm_check
     */
    public int solution(int[] A) {
        int[] r = new int[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            r[A[i] - 1] = A[i];
        }

        for (int i = 0; i < r.length; i++) {
            if (r[i] == 0 && i != r.length - 1) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        int solution1 = new PermCheck().solution(new int[]{4, 1, 2, 3});
        System.out.println(solution1);

        int solution2 = new PermCheck().solution(new int[]{4, 1, 3});
        System.out.println(solution2);
    }

}
