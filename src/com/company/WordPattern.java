package com.company;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args){
        WordPattern test = new WordPattern();
        System.out.println(test.wordPattern("abba","dog catd cat dog"));
    }

    public boolean wordPattern(String pattern, String str) {
        // Map<Object, Integer> map = new HashMap<>();
        Map<Object,Integer> pat = new HashMap<>();
        Map<Object,Integer> strs = new HashMap<>();
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            strs.put(words[i], i);
            System.out.println(pattern.charAt(i));
            pat.put(pattern.charAt(i), i);
            if (!strs.get(words[i]).equals(pat.get(pattern.charAt(i))))
                return false;
        }
        return true;
    }
}
