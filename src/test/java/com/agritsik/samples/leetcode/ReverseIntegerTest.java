package com.agritsik.samples.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void reverse1() throws Exception {
        assertEquals(321, new ReverseInteger().reverse(123));
    }

    @Test
    public void reverse2() throws Exception {
        assertEquals(-321, new ReverseInteger().reverse(-123));
    }

    @Test
    public void reverse3() throws Exception {
        assertEquals(0, new ReverseInteger().reverse(1534236469));
    }

}