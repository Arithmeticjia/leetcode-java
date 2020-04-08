package com.company;

import java.util.HashMap;

public class longestPalindrome {

    public int longestPalindrome(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans = 0;
        for(Integer v:map.values()){
            ans += v / 2 * 2;
            // 此时该字符是奇数并且当前长度是偶数（说明还没有奇数出现过）
            if(v % 2 == 1 && ans % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}
