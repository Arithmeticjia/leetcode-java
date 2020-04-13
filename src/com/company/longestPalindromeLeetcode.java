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

    public static String longestPalindromeDp(String s){
        int length = s.length();
        int max = 0;
        String ans = "";
        boolean[][] p = new boolean[length][length];
        for(int len = 1;len <= length;len++){
            for(int start = 0;start < length;start++){
                int end = start + len - 1;
                if (end >= length)
                {
                    break;
                }
                p[start][end] = (len == 1 || len == 2 || p[start+1][end-1]) && s.charAt(start) == s.charAt(end);
                if(p[start][end] && len > max){
                    ans = s.substring(start,end+1);
                    max = len;
                }
            }
        }
        return ans;
    }
}
