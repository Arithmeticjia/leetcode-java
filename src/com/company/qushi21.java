package com.company;

import java.util.Scanner;

public class qushi21 {

    public static void longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            System.out.println("null");
        }

        int maxLen = 1;
        String res = s.substring(0, 1);
        boolean flag = false;
        // 枚举所有长度大于等于 2 的子串
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 >= maxLen && valid(s, i, j)) {
                    maxLen = j - i + 1;
                    // res = s.substring(i, j + 1);
                    System.out.println(s.substring(i, j + 1));
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("null");
        }
    }

    private static boolean valid(String s, int left, int right) {
        // 验证子串 s[left, right] 是否为回文串
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        longestPalindrome(str);
    }
}


