import java.util.*;



public class zhibi {
    public static void cashNum(int n){
        int[] money ={1,2,5};
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 1;
        for(int i = 5;i <= n;++i){
            dp[i] = Math.min(Math.min(dp[i-1]+1,dp[i-2]+1),dp[i-5]+1);
        }
        System.out.println(dp[n]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cashNum(n);
    }
}
