package com.company;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String[] args){
        twoSum test = new twoSum();
        int[] t = {2, 7, 11, 15};
        for(int i:test.twoSum(t,9)){
            System.out.print(i);
        }
    }

    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            //这里一定要把数组的值作为key，因为后面要通过数组的值去查
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 判断是否有key
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
