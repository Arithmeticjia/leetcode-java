package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permute {

    public static void main(String[] args){
        int[] t = {1,2,3};
        System.out.print(permute.permute(t));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums != null && nums.length > 0) {
            PermutationHelper(nums, 0, ans);
        }
        return ans;

    }
    public static void PermutationHelper(int[] nums,int i,List<List<Integer>> list){
        // 如果交换到最后了并且不包含的情况下，把当前的nums的排列组合添加到新的list中
        if(i == nums.length -1){
            List<Integer> temp = new ArrayList<>();
            for (Integer s : nums) {
                temp.add(s);
            }
            list.add(temp);
            // 继续交换
            // 从i开始，和往后的每一个（包括自己）的数交换
        }else{
            for (int j = i; j < nums.length; j++) {
                swap(nums, i, j);
                PermutationHelper(nums, i+1, list);
                // 再交换回来
                swap(nums, i, j);
            }
        }
    }

    public static void swap(int[] c,int i,int j){
        int t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
}
