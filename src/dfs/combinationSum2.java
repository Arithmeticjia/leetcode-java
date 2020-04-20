package dfs;

import java.util.*;

public class combinationSum2 {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length == 0|| candidates == null){
            return ans;
        }
        Arrays.sort(candidates);
        dfs(candidates,target,0,0,new ArrayList<>());
        return ans;
    }
    public void dfs(int[] candidates,int target,int sum,int index,List<Integer> temp){
        if(sum == target){
            ans.add(new ArrayList(temp));
            return;
        }else{
            for(int i = index;i < candidates.length;i++){
                if(i > index && candidates[i] == candidates[i-1]){
                    continue;
                }
                if(sum + candidates[i] <= target){
                    temp.add(candidates[i]);
                    dfs(candidates,target,sum+candidates[i],i+1,temp);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
}
