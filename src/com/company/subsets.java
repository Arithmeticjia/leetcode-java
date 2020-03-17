package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets {

    public static void main(String[] args){
        subsets test = new subsets();
        subsets newtest = new subsets();
        int[] t = {1,2,3,4};
        System.out.println(test.subsets(t));
        System.out.println(newtest.subset(t));
    }

    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,res,tmp);
        return res;
    }

    public void backtrack(int[] nums, int start, List<List<Integer>> res, List<Integer> tmp){
        if(start > nums.length) {
            return;
        }
        if(!res.contains(tmp)){
            res.add(new ArrayList<>(tmp));
        }
        for(int i = start;i < nums.length;i++){
            tmp.add(nums[i]);
            backtrack(nums,i+1,res,tmp);
            tmp.remove(tmp.size()-1);
        }
    }

    public List<List<Integer>> subset(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int n:nums) {
            int size = ans.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(ans.get(i));
                subset.add(n);
                ans.add(subset);
            }
        }
        return ans;
    }

//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        Arrays.sort(nums);
//        backtrack(nums,result,0,new ArrayList<>());
//        return result;
//    }
//
//    public void backtrack(int[] nums,List<List<Integer>> result,int i,List<Integer> l){
//        if(i>nums.length){return ;}
//        if(!result.contains(l)){
//            result.add(new ArrayList<>(l));
//        }
//        for(int start=i;start<nums.length;start++){
//            l.add(nums[start]);
//            backtrack(nums,result,start+1,l);
//            l.remove(l.size()-1);
//        }
//    }
}
