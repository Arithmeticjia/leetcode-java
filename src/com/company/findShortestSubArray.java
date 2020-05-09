package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * count集合存储每个元素出现的次数
 * left元素存储第一次出现的位置
 * right元素存储最后一次出现的位置
 */
public class findShortestSubArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap();
        Map<Integer, Integer> right = new HashMap();
        Map<Integer, Integer> count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null){
                left.put(x, i);
            }
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}
