package com.agritsik.samples.codingbat.string;

/**
 * Created by andrey on 9/30/15.
 */
public class String3 {

    public int countYZ(String str) {
        char[] chars = str.toCharArray();
        int count = 0;

        int i = 0;
        while (i < chars.length) {
            if ((chars[i] == 'y' || chars[i] == 'Y' || chars[i] == 'z' || chars[i] == 'Z')
                    && (i + 1 == chars.length || !Character.isLetter(chars[i + 1])))
                count++;
            i++;
        }

        return count;
    }




}
