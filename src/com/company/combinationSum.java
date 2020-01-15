package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {

    public static void main(String[] args){
        combinationSum test = new combinationSum();
        int[] t = {2,3,6,7};
        System.out.print(test.combinationSum(t,7));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,0,res,tmp);
        return res;
    }

    public void backtrack(int[] candidates,int target,int start,List<List<Integer>> res,List<Integer> tmp){
        if(target < 0) return;
        else if(target == 0){
            res.add(new ArrayList<>(tmp));
            return;
        }else{
            for(int i = start; i < candidates.length;i++){
                if (i < 0) break;
                tmp.add(candidates[i]);
                backtrack(candidates, target - candidates[i], i, res, tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
