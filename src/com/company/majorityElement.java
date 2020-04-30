package com.company;

public class majorityElement {

    public int majorityElement(int[] nums) {
        // x是众数
        // votes是总票数
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0){
                x = num;
            }
            // num当前数 == x(众数) 投票+1，否则投票-1
            votes += num == x ? 1 : -1;
        }
        return x;
    }
}
