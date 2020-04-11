package com.company;


public class numDecodings {

    public static void main(String[] args) {
        System.out.println(numDecodings.numDecodings("12"));
    }

    public static int numDecodings(String s) {
        //以0开头的字符串，0是非法字符，只有在“10”，“20”这两种情况下出现才合法，这里直接0打头，摊牌了，没法玩了
        if(s.charAt(0)=='0') {
            return 0;
        }
        int[] dp=new int[s.length()];
        //单独一个不是0的数字（1~9）必合法
        dp[0]=1;
        // 从第二个数字开始遍历
        for(int i=1;i<s.length();i++){
            //当前数字为‘0’
            if(s.charAt(i)=='0'){
                //连续两个0，整个字符串非法，没法解
                if(s.charAt(i-1)=='0') {
                    return 0;
                } else{
                    if(s.charAt(i-1)>'2') {
                        //0前头不是1，也不是2，非法组合（既不能和前一个合并，也不能单独拿出来）
                        return 0;
                    } else {
                        //“10”或者“20”的情况，只能把10，20绑定在一起解码，如“110”只有1种解码方法
                        // 判断i-2是否存在
                        dp[i]=i-2 < 0 ?1:dp[i-2];
                    }
                }
                //当前数字不为0
            }else{
                if(s.charAt(i-1)=='0') {
                    //如“1105”，指到5时，5不能和前面的0组合，0只能和1绑定在一起，所以还是1种解码方法
                    dp[i]=dp[i-1];
                    //前面数字也不是0
                } else{
                    //判断是否是1-26
                    if(Integer.parseInt(s.substring(i-1,i+1))<=26) {
                        dp[i]=(i-2)<0?2:(dp[i-1]+dp[i-2]);
                    } else {
                        //如“138”，只有1种解法，只能单独拿出来
                        dp[i]=dp[i-1];
                    }
                }
            }
        }
        return dp[s.length()-1];
    }
}
