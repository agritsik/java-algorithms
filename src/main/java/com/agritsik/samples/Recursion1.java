package com.agritsik.samples;

/**
 * Created by andrey on 9/30/15.
 */
public class Recursion1 {

    public int factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }

}
