package com.agritsik.samples.codingbat.string;

/**
 * Created by andrey on 9/29/15.
 */
public class String1 {

    public String helloName(String name) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append(name);
        sb.append("!");
        return sb.toString();
    }

    public String makeAbba(String a, String b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b).append(b).append(a);
        return sb.toString();
    }

    public String makeTags(String tag, String word) {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tag).append(">").append(word).append("</").append(tag).append(">");
        return sb.toString();
    }


}
