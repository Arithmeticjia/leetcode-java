package NowcodeHuaWei;

import java.util.Scanner;

/**
 * 走楼梯
 * 1、每次可以走一步或者两步
 * 2、不能连续的走两步
 * 3、输入：楼梯的层数
 * 4、输出：总共有多少种走法
 */
public class bytedance3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        if(n == 0){
            System.out.print(0);
            return;
        }

        long[] one = new long[n+1];
        long[] two = new long[n+1];

        one[1] = one[2] = 1;
        two[2] = 1;

        for (int i = 3; i <= n; ++i) {
            one[i] = one[i-1] + two[i-1];
            two[i] = one[i-2];
        }

        System.out.println(one[n] + two[n]);
    }
}
