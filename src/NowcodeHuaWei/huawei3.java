package NowcodeHuaWei;

import java.util.*;

/**
 * 卡车K
 * 给定一个数组W
 * 给定一个数组V
 */
public class huawei3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] w = new int[n];
        int[] v = new int[n];
        for(int i = 0; i < n;i++){
            w[i] = sc.nextInt();
        }
        for(int j = 0; j < n;j++){
            v[j] = sc.nextInt();
        }

        int[] dp = new int[k+1];
        for(int i = 0; i < n;i++){
            for(int j = k;j >= w[i];j--){
                dp[j] = Math.max(dp[j],dp[j-w[i]] + v[i]);
            }
        }

        System.out.println(dp[k]);

    }
}


