package dfs;

import java.util.ArrayList;
import java.util.List;

public class permuteUnique {

    public static void main(String[] args){
        int[] n = new int[]{1,2,3};
        System.out.print(permuteUnique(n));
    }

    public static List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        if(nums != null || nums.length == 0){
            PermutationHelper(nums,0,ans);
        }
        return ans;
    }

    public static void PermutationHelper(int[] nums,int i,List<List<Integer>> list){
        if(i == nums.length - 1){
            List<Integer> temp = new ArrayList<>();
            for(Integer n:nums){
                temp.add(n);
            }
            if(!list.contains(temp)){
                list.add(temp);
            }
        }
        for(int k = i;k < nums.length;k++){
            swap(nums,i,k);
            PermutationHelper(nums,i+1,list);
            swap(nums,i,k);
        }
    }

    private static void swap(int[] nums, int i, int k) {
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k] = temp;
    }
}
