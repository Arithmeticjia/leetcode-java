package NowcodeHuaWei;

import java.util.*;

public class maxSubString {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.print(getCommonStrLength(str1, str2));
        }
    }

    public static int getCommonStrLength(String str1, String str2){

        int len1 = str1.length();
        int len2 = str2.length();
        //表示以str1[i]和str2[j]为结尾的最长公共子串
        int[][] dp = new int[len1+1][len2+1];

        //初始化
        for(int i=0;i<=len1;i++){
            for(int j=0;j<=len2;j++){
                dp[i][j] = 0;
            }
        }

        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    //表示以str1[i]和str2[j]为结尾的最长公共子串 + 1
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    //结束啦，重头再来
                    dp[i][j] = 0;
                }
            }
        }
        int max = 0;
        for(int i=0;i<=len1;i++){
            for(int j=0;j<=len2;j++){
                if(max < dp[i][j]) {
                    max = dp[i][j];
                }
            }
        }

        return max;

    }
}
