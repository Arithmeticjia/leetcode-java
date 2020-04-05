package com.company;

import java.util.ArrayList;
import java.util.List;

public class findContinuousSequence {

    public int[][] findContinuousSequence(int target) {
        int i = 0;
        int j = 0;
        int sum = 0;
        List<int[]> res = new ArrayList<>();

        while(i <= target / 2){
            // 向右边界移动
            if(sum < target) {
                sum += j;
                j++;
            }else if(sum > target) {
                // 左边界向右移动
                sum -= i;
                i++;
            }else {
                // 记录结果
                int[] arr = new int[j-i];
                for(int k = i; k < j;k++){
                    arr[k-i] = k;
                }
                res.add(arr);
                // 左边界向右移动
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
