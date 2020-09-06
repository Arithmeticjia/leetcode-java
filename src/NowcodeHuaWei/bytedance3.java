package NowcodeHuaWei;

import java.util.Scanner;

/**
 * 给定一个长为n*m的序列，这个序列是由一个长为n的序列重复m次得来的。问这个序列的最大连续子段和是多少。
 * (1<=n,m<=10^5)
 *
 * 重复了m次的序列称为一段序列。如果m为1，那就是一个普通的最大连续子段和的题了。如果m≠1
 * 那么结果一定是某一段序列的最大连续子段和，或者是这一段的后缀加这一段的前缀，或者如果一段序列总和大于0，那就是这一段的后缀加这一段的前缀再加上m-2m−2段序列。m\neq 1m
 * 
 * ​
 *  =1总体思路和mm为11时是差不多的，求后缀拼前缀时把这一段序列接起来变成两段序列再求一下最大连续子段和即可。
 */
public class bytedance3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();

        int ans = Integer.MIN_VALUE;

        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = in.nextInt();
            sum += array[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }

            if (i != 0) {
                array[i] += array[i-1];
            }
        }
        int t = 0, s = 0;
        for (int i = 0; i < n; ++i) {
            t = Math.max(t, array[i]);
            s = Math.max(s, array[n-1]-array[i]);
        }

        if (m > 2) {
            ans = Math.max(ans, t + s + array[n-1] * (m-2));
        }
        ans = Math.max(ans, array[n-1] * m);
        System.out.println(ans);
    }
}

