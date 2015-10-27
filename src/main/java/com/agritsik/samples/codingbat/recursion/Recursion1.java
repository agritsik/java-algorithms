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

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;

        return (bunnies % 2 == 0) ? 3 + (bunnyEars2(bunnies - 1)) : 2 + (bunnyEars2(bunnies - 1));
    }

    public int count7(int n) {
        if (n == 0) return 0;
        return (n % 10 == 7) ? 1 + count7(n / 10) : count7(n / 10);
    }


}
