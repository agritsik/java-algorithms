package com.agritsik.samples.codingbat.recursion;

/**
 * Created by andrey on 9/30/15.
 */
public class Recursion1 {

    public int factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }

    public int bunnyEars(int bunnies) {
        return (bunnies > 0) ? (2 + bunnyEars(bunnies - 1)) : 0;
    }

    public int fibonacci(int n) {

        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
