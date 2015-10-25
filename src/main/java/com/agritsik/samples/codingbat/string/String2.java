package com.agritsik.samples.codingbat.string;

/**
 * Created by andrey on 9/30/15.
 */
public class String2 {

    public String doubleChar(String str) {

        char[] chars = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]).append(chars[i]);
        }

        return sb.toString();
    }

    public int countHi(String str) {
        char[] chars = str.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == 'h' && chars[i + 1] == 'i') count++;
        }
        return count;
    }

    public boolean catDog(String str) {

        char[] chars = str.toCharArray();
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == 'c' && chars[i + 1] == 'a' && chars[i + 2] == 't') {
                catCount++;
                i += 2; // speed up a little :)
            }
            if (chars[i] == 'd' && chars[i + 1] == 'o' && chars[i + 2] == 'g') {
                dogCount++;
                i += 2; // speed up a little :)
            }
        }

        return catCount == dogCount;

    }

}
