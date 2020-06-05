package com.company;

import java.util.HashMap;

public class climbStairs {
    public int climbStairs(int n){
        if(n == 1){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public int climbStairsRec(int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        return helper(n,map);
    }

    private int helper(int n, HashMap<Integer, Integer> map) {
        if(n <= 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }else {
            int value = (helper(n-1,map) + helper(n-2,map));
            map.put(n,value);
            return value;
        }
    }
}
