package bishi2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class doudizhu {

    public static String doudizhu(String s){
        if(s.length() == 0) {
            return null;
        }
        int cur_l = 0, cur_r = 1;//当前的区间
        int max_l = 0, max_r = 0;//维护的最大区间
        int max_len = 0, cur_len = 1;//维护两个长度
        int[] dp =new int[s.length()];
        int cnt = 0;
        for(int i = 0;i < s.length();i++){
            char c=s.charAt(i);
            dp[cnt++] = c - '0';
        }
        //dp[cnt]=0;
        for(int i = 1;i < cnt; i++, cur_r++){
            if(dp[i] == (dp[i-1] +1 )){
                cur_len++;
            }else{
                //System.out.println("cur_len:"+cur_len+" max_len="+max_len);
                if(cur_len>=max_len){
                    max_l = cur_l;
                    max_len = cur_len;
                    max_r = cur_r;
                    //System.out.println("cur_l="+cur_l+"   cur_r="+cur_r);
                }
                cur_l = cur_r;
                cur_len = 1;
            }
        }
        if(cur_len >= max_len){//判断最后一次，最长的序列在最后情况
            max_l = cur_l;
            max_len = cur_len;
            max_r = cur_r;
            //System.out.println("cur_l="+cur_l+"   cur_r="+cur_r);
        }
//        System.out.println("lastcur_l="+cur_l+"   cur_r="+cur_r);
        System.out.println("cur_len:"+cur_len+" max_len="+max_len);
        System.out.println("max_l="+max_l+"   max_r="+max_r);
        String ans="";
        for(int i=max_l;i<max_r;i++) {
            ans+=dp[i];
        }

        return ans;
    }

    public static void main(String args[]) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            String s = cin.nextLine();
            String res = doudizhu(s);
            System.out.println(res);
        }
    }


}
