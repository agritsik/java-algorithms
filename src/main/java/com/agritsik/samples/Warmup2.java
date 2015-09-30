package com.agritsik.samples;

/**
 * Created by andrey on 9/29/15.
 */
public class Warmup2 {

    public String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }

        return sb.toString();
    }

    public String frontTimes(String str, int n) {
        String three = str.substring(0, Math.min(3, str.length()));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(three);
        }

        return sb.toString();
    }

    int countXX(String str) {

        int r = 0;
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {

            if (chars[i] == 'x' && chars[i] == chars[i + 1]) r++;
        }

        return r;
    }


}
