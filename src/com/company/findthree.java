package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// not a leetcode question
public class findthree {

    public static void main(String[] args){
        findthree test = new findthree();
        int[] t = {-1,2,1,-4};
        System.out.println(test.findthree(t));
    }

    public List<List<Integer>> findthree(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    ans.add(tmp);
                }
            }
        }
        return ans;
    }


}
