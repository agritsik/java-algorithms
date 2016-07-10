package com.agritsik.samples.codility.examples;

/**
 * Created by andrey on 7/10/16.
 */
public class CodilityFirst {

    /**
     * 9%
     */
    // [-1, 2, 2, 2, 2, 2, 3, 4, 4, 4, 6] // 5
    int solution1(int[] A) {
        int n = A.length;
        int[] L = new int[n + 1];
        L[0] = -1;
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
        }
        int count = 0;
        int pos = (n + 1) / 2;
        int candidate = L[1];
        for (int i = 1; i <= n; i++) {
            if (L[i] == candidate)
                count = count + 1; if (L[i] != candidate && count > pos) return candidate; if (L[i] != candidate && count < pos) candidate = L[i];
        }
        if (count > pos)
            return candidate;
        return (-1);
    }


    /**
     * perfect
     */
    // 0, 1, 3, -2, 0, 1, 0, -3, 2, 3
    // i , j , k
    public int solution2(int[] A) {

        int depth = -1;

        int i = 0;
        while (i < A.length) {

            // >>>
            boolean foundD = false;
            int j = i;
            while (j + 1 < A.length && A[j] > A[j + 1]) {
                foundD = true;
                j++;
            }

            if (!foundD) {
                i++;
                continue;
            }


            // <<<
            boolean foundI = false;
            int k = j;
            while (k + 1 < A.length && A[k] < A[k + 1]) {
                foundI = true;
                k++;
            }

            if (!foundI) {
                i++;
                continue;
            }

            int currentDepth = Math.min(A[i] - A[j], A[k] - A[j]);
            if (currentDepth > depth) depth = currentDepth;

            i++;
        }

        return depth;
    }


    /**
     * 25%
     */
    public int solution3(int[] A, int[] B) {
        int r = 0;
        double[] C = new double[A.length];

        int i = 0;
        while (i < C.length) {
            C[i] = A[i] + (double) B[i] / 1_000_000;
            i++;
        }

        i = 0;
        int j = 0;
        while (i < C.length) {
            j = i + 1;

            while (j < C.length) {
                if (C[i] * C[j] >= C[i] + C[j]) {
                    r += C.length - j;
                    break;
                } else {
                    j++;
                }
            }

            i++;
        }

        return r;
    }

}
