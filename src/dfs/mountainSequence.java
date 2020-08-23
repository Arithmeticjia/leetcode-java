package dfs;

import java.util.*;


public class mountainSequence {
    /**
     * 返回最大山峰序列长度
     * @return int整型
     */

    public static void main(String[] args) {
        int[] t = {1,2,3,6,1};
        System.out.print(new mountainSequence().mountainSequence(t));
    }

    public int mountainSequence (int[] numberList) {
        // write code here
        int n = numberList.length;
        if(n == 1){
            return 1;
        }
        // dp[k][i]表示以第i个数为结尾的最大山峰子序列长度
        // k属于（0,1）表示当前数nums[i]是处于上升还是下降
        int[][] dp = new int[2][n];

        dp[0][0] = 1;
        dp[1][0] = 1;
        int res = 0;
        for(int i = 1; i < n;i++){
            int max0 = 0;
            int max1 = 0;
            for(int j = 0; j < i;j++){
                // 上升
                if(numberList[i] > numberList[j]){
                    if(dp[0][j] > max0){
                        max0 = dp[0][j];
                    }
                }else if(numberList[i]<numberList[j]){
                    if(dp[0][j] > max1){
                        max1 = dp[0][j];
                    }
                    if(dp[1][j] > max1){
                        max1 = dp[1][j];
                    }
                }
            }
            dp[0][i] = max0+1;
            dp[1][i] = max1+1;
            res = Math.max(res, Math.max(dp[0][i],dp[1][i]));
        }
        return res;
    }
}
