package com.company;


import java.util.ArrayList;
import java.util.List;

public class zhaoshang2 {

    public static void main(String[] args) {
        zhaoshang2 obj = new zhaoshang2();
        String input1 = "12345";
        Long result1 = obj.addPlus(input1,3);
        System.out.println("input > " + input1 + " ; result > " + result1);
    }

    public long addPlus(String input,long k) {
        if (input == null || input.length() == 0) {
            return 0;
        }

        long result = 0;
        List<String> resultList = new ArrayList<String>();
        char[] chars = input.toCharArray();
        // dfs
        dfs(chars, resultList, "", 0);

        // loop list sum
        for (String s: resultList) {
            String[] nums = s.split("\\+");
            for (String n: nums) {
                if(Long.parseLong(n) == k) {
                    result++;
                }
            }
        }

        return result;
    }

    private void dfs(char[] chars, List<String> resultList, String s, int start) {
        // exit
        if (start == chars.length - 1) {
            resultList.add(s + chars[chars.length - 1]);
            return;
        }
        s += chars[start];
        dfs(chars, resultList, s + '+', start + 1);
        dfs(chars, resultList, s, start + 1);
    }
}


