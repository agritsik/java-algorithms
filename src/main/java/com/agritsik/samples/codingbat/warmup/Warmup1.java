package com.agritsik.samples.codingbat.warmup;

/**
 * Hello world!
 *
 */
public class Warmup1
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);

    }

    public int sumDouble(int a, int b) {

        return (a == b) ? 2 * (a + b) : a + b;
    }

}
