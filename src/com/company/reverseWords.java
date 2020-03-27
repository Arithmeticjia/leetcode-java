package com.company;

import java.util.Arrays;

public class reverseWords {

    public static void main(String[] args){
        reverseWords test = new reverseWords();
        String t = " I love u  ";
        String k = " ";
        String m = "the sky is blue";
        System.out.print(reverseWords(m));
    }

    public static String reverseWords(String s){

        if(s == null){
            return "";
        }
        // 如果全是空格，根据测试用例返回""或者" "
        if("".equals(s.trim())){
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = words.length - 1;i >= 0;i--){
            if("".equals(words[i]) ){
                continue;
            }
            ans.append(words[i]);
            ans.append(" ");
        }
        // 把最后一个加上的空格" "去掉
        return ans.toString().trim();
    }
}
