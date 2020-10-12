package NowcodeHuaWei;

import java.util.*;


public class weimeng3 {
    /**
     *
     * @param n int整型
     * @return int整型
     */
    public int getPayCount (int n) {
        // write code here
        int money[]={1,2,5,10};
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i = 0;i < 4;++i){
            for(int j = money[i];j <= n;++j){
                dp[j] =(dp[j]+dp[j-money[i]]);
            }
        }

        return dp[n];
    }
}
