package com.agritsik.samples.popular;

import org.apache.commons.collections4.trie.PatriciaTrie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrey on 11/1/15.
 */
public class DictionarySearch {

    // domakedo

    static List<String> list = new ArrayList<String>() {{
        add("and");
        add("do");
        add("make");
    }};

    static PatriciaTrie trie = new PatriciaTrie(){{
        put("and", null);
        put("do", null);
        put("make", null);
    }};


    public static void main(String[] args) {
        System.out.println("Result: " + execute("domake"));
        System.out.println("Result: " + execute("doanddo"));
        System.out.println("Result: " + execute("doando"));
    }

    private static boolean execute(String q) {
        if(q.length()==0) return true;

        for (int i = 1; i <= q.length(); i++) {

            String substring = q.substring(0, i);

            if (containsInTrie(substring)) {
                return execute(q.substring(i));
            }

        }
        return false;
    }

    static boolean containsInList(String q) {
        return list.contains(q);
    }

    static boolean containsInTrie(String q) {
        return trie.containsKey(q);
    }




}
