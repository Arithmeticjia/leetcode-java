package com.company;

/*
给定一个包含大写英文字母和数字的句子，找出这个句子所包含的最大的十六进制整数，返回这个整数的值。数据保证该整数在int表示范围内
 */

public class solve {

    public int solve(String s) {
        int begin = 0;
        int end = 0;
        int result = 0;
        for(int i=0;end<s.length();i++) {
            if(Character.isDigit(s.charAt(i)) || (s.charAt(i)) >= 'A' && (s.charAt(i)) <= 'Z'){
                end++;
                result = Math.max(Integer.parseInt(s.substring(begin,end)),result);
            }else {
                begin = i+1;
                end = begin;
            }
        }
        return result;
    }
}
