package com.company;

import java.util.HashMap;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set = new HashSet<>();
        // int i = 0,j = 0, ans = 0;
        // while(i < s.length() && j < s.length()){
        //     if(!set.contains(s.charAt(j))){
        //         set.add(s.charAt(j++));
        //         ans = Math.max(ans,j-i);
        //     }
        //     else{
        //         set.remove(s.charAt(i++));
        //     }
        // }
        // return ans;
        int ans = 0;
        int i = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int j = 0;j < s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(s.charAt(j)));
            }
            ans = Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }
}
