package com.company;

import java.util.HashMap;
import java.util.Map;

public class singleNumber {
    public int singleNumber(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums){
        //     if (!set.add(num)){
        //         set.remove(num);
        //     }
        // }
        // for(int s:set){
        //     return s;
        // }
        // return -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // for(int i = 0;i < nums.length;i++){
        //     if(map.get(nums[i]) == 1){
        //         return nums[i];
        //     }
        // }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
