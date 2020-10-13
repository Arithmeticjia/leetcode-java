package bishi2020;

import java.util.LinkedHashMap;
import java.util.Map;

public class solveMaxLength {

    public static void main(String[] args) {
        int[] u = {2,3,5,4,5,5};
        int[] v = {5,2,1,6,7,4};
        int[] w = {15,6,14,4,1,6};
        int m = 7;
        System.out.println(new solveMaxLength().solve(m, u, v, w));
    }

    long[][] dp = new long[100010][2];
    int[][] g = new int[100010][2];
    Map<Integer, Map<Integer,Integer>> map = new LinkedHashMap<>();

    public long solve (int n, int[] u, int[] v, int[] w) {
        // write code here
        for(int i = 0; i < n - 1;i++){
            int[] tmp1 = new int[]{v[i], w[i]};
            int[] tmp2 = new int[]{u[i], w[i]};
            g[u[i]] = tmp1;
            g[v[i]] = tmp2;
        }

        dfs(1,0);
        long res = 0;
        for(int i = 1; i <= n;i++){
            res = Math.max(res, dp[i][0] + dp[i][1]);
        }

        return res;
    }

    public void dfs(int x, int fa){
        int v = g[x][0];
        int w = g[x][1];
        if(v == fa){
            return;
        }
        dfs(v,x);
        if(dp[x][0] < dp[v][0] + w){
            dp[x][1] = dp[x][0];
            dp[x][0] = dp[v][0] + w;
        }else if (dp[x][1] < dp[v][0] + w){
            dp[x][1] = dp[v][0] + w;
        }
    }
}
