package com.company;

import java.util.Arrays;

public class threeSumClosest {

    public static void main(String[] args){
        threeSumClosest test = new threeSumClosest();
        int[] t = {-1,2,1,-4};
        System.out.println(test.threeSumClosest(t,1));
    }

    public int threeSumClosest(int[] nums,int target){
        // sort -4,-1,1,2
        Arrays.sort(nums);
        // 最小的三个数
        int ans = nums[0] + nums[1] + nums[2];
        for(int i = 0;i < nums.length;i++){
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end){
                int sum = nums[i] + nums[end] + nums[start];
                if(Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if(sum > target)
                    end--;
                else if(sum < target)
                    start++;
                else
                    return ans;
            }
        }
        return ans;
    }
}
