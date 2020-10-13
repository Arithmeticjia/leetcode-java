package bishi2020;

import java.util.*;

/**
 * 卡车K（总容量）
 * 有N个箱子
 * 给定一个数组W，每个箱子的容量为w[i]
 * 给定一个数组V，每个箱子价值为v[i]
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


