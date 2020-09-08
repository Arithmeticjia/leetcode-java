package NowcodeHuaWei;

import java.util.Scanner;

public class huawei1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        float[][] dp = new float[n][m];
        float[][][] arr = new float[n][m][3];
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++){
                arr[i][j][0] = sc.nextFloat();
                arr[i][j][1] = sc.nextFloat();
                arr[i][j][2] = sc.nextFloat();
                arr[i][j][0] /= (1-arr[i][j][2]);
                arr[i][j][1] /= (1-arr[i][j][2]);
            }
        }

        dp[0][0] = 1;
        for(int i = 1; i < n;i++){
            //右初始化
            dp[0][i] = dp[0][i-1]*arr[0][i-1][0]*i;
        }

        for(int i = 1; i < m;i++){
            //下初始化
            dp[i][0] = dp[i-1][0]*arr[i-1][0][1]*i;
        }


        for(int i = 1; i < n;i++){
            for(int j = 1;j < m;j++){
                //朝下+朝右
                dp[i][j] = dp[i-1][j]*arr[i-1][j][0] + dp[i][j-1]*arr[i][j-1][1];
                dp[i][j] *= (i+j);
            }
        }

        System.out.println(dp[n-1][m-1]+1);

    }
}
