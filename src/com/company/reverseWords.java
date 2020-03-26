package com.company;

import java.util.Arrays;

public class reverseWords {

    public String reverseWords(String s){

        if(s == null){
            return "";
        }
        String[] words = s.split(" ");
        System.out.print(Arrays.toString(words));
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i < words.length;i++){
            if("".equals(words[i]) ){
                continue;
            }
            ans.append(words[i]);
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}
