package com.company;

/**
 * 1399. 统计最大组的数目
 * 给你一个整数 n 。请你先求出从 1 到 n 的每个整数 10 进制表示下的数位和（每一位上的数字相加）
 * 然后把数位和相等的数字放到同一个组中
 * 输入：n = 13
 * 输出：4
 * 解释：总共有 9 个组，将 1 到 13 按数位求和后这些组分别是：
 * [1,10]，[2,11]，[3,12]，[4,13]，[5]，[6]，[7]，[8]，[9]。总共有 4 个组拥有的数字并列最多。
 */
public class countLargestGroup {

    public int countLargestGroup(int n){
        int ans = 0;
        int max = 1;
        int[] sum = new int[n+1];
        int[] count = new int[n+1];

        for(int i = 1;i <= n;i++){
            //计算1-n各个元素的数位和，例如数字i的数位和是sum[i / 10] + i % 10
            sum[i] = sum[i / 10] + i % 10;
            count[sum[i]]++;
            if(count[sum[i]] > max){
                max = count[sum[i]];
            }
        }

        for(int num: count){
            ans += num == max ? 1 : 0;
        }

        return ans;
    }
}
