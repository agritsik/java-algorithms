package com.agritsik.samples.leetcode;


import java.util.LinkedList;

/**
 * Reverse digits of an integer.
 * https://leetcode.com/problems/reverse-integer/description/
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p>
 * Note:
 * The input is assumed to be a 32-bit signed integer.
 * Your function should return 0 when the reversed integer overflows.
 */
public class ReverseInteger {

    public int reverse(int x) {

        boolean sign = x > 0;
        x = Math.abs(x);

        int remainder, r = 0;
        LinkedList<Integer> list = new LinkedList<>();

        //
        while (x > 0) {
            remainder = x % 10;
            x = (x - remainder) / 10;
            list.add(remainder);
        }
        System.out.println(list);

        //
        double pow = Math.pow(10, list.size());
        for (Integer i : list) {
            pow = pow / 10;

            r += i * pow;
            if (r == Integer.MAX_VALUE) return 0;
        }
        System.out.println(r);

        return (sign) ? r : -1 * r;
    }

}
