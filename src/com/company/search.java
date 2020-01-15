package com.company;

public class search {

    public static void main(String[] args){
        search test  = new search();
        int[] nums = {1,2,3};
        System.out.println(test.search(nums,2));
    }

    public int search(int[] nums, int target) {
        int p, left = 0;
        int right = nums.length - 1;
        while(left <= right){
            p = left + (right - left) / 2;
            if (nums[p] == target){
                return p;
            }
            if (nums[p] > target)
                right = p - 1;
            else
                left = p + 1;
        }
        return -1;
    }
}
