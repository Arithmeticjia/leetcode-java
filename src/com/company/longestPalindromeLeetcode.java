package com.company;

public class longestPalindromeLeetcode {

    public static void main(String[] args){
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s){
        int len = s.length();
        int max = 0;
        String ans = "";
        for(int i = 0;i < len;i++){
            for(int j = i+1;j <= len;j++){
                String temp = s.substring(i,j);
                if(isOk(temp) && temp.length() > max){
                    ans = temp;
                    max = temp.length();
                }
            }
        }
        return ans;
    }

    public static boolean isOk(String s){
        for(int i = 0;i < s.length() / 2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
