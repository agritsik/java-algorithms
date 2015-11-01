package com.agritsik.samples.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrey on 11/1/15.
 */
public class DictionarySearch {

    // domakedo

    static List<String> d = new ArrayList<String>() {{
        add("and");
        add("do");
        add("make");
    }};


    public static void main(String[] args) {

        String q = "doando";
        boolean b = execute(q);

        System.out.println("Result: " + b);

    }

    private static boolean execute(String q) {
        if(q.length()==0) return true;

        for (int i = 1; i <= q.length(); i++) {

            String substring = q.substring(0, i);

            if (contains(substring)) {
                return execute(q.substring(i));
            }

        }
        return false;
    }

    static boolean contains(String q) {
        return d.contains(q);
    }


}
