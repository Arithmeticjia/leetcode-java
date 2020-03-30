package com.company;

import java.util.HashMap;

public class firstUniqChar {

    public char firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
        for(int i = 0;i < s.length();i++){
            if(map.get(s.charAt(i)) <= 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
