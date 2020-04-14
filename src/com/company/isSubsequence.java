package com.company;

public class isSubsequence {

    public boolean isSubsequence(String s, String t) {

        int slen = s.length();
        int tlen = t.length();
        if (slen > tlen){
            return false;
        }
        if (slen == 0){
            return true;
        }
        boolean[][] dp = new boolean[slen+1][tlen+1];
        for(int j = 0;j < tlen;j++){
            dp[0][j] = true;
        }
        for(int i = 1;i < slen;i++){
            dp[i][0] = false;
        }

        for(int i = 1;i <= slen;i++){
            for(int j = 1;j <= tlen;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    // i是不可以往前推的，因为s必须作为一个完整的字符串参与比较
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[slen][tlen];
    }
}
