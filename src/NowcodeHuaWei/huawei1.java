package NowcodeHuaWei;

import java.util.Scanner;

/**
 * https://www.cnblogs.com/cstdio1/p/13605803.html
 * 幼儿园小朋友站成一列，按位置1，2，3...顺序编号，每个小朋友都拿了若干糖果，请找出三位小朋友
 * 他们拿着相同颜色的糖果，且他们拿的糖果的总数不少于其他任何三位小朋友
 * 糖果只有两种颜色，1是红色，2是蓝色
 *
 * 输入样例：
 * 6
 * 2 2
 * 2 1
 * 3 2
 * 5 2
 * 3 1
 * 7 2
 * 输出样例：
 * 3 4 6（三个小朋友的编号）
 * 2（糖果颜色）
 * 15（三个人拿的总数）
 *a
 * 思路
 * 1、两个ArrayList分别存储颜色为1.2的数据，上面讲的ArrayList里面还是个ArrayList<Integer>存糖果数量和编号，
 * 2、判断两个list的数量是否有一个大于等于3，没有就输出null，不然就分别对两个颜色的list排序，按照糖果数量优先，从大到小，编号在后，从小到大。
 * 3、如果任意一个颜色的list.size达到3，就取前三个，求和sum，并记录编号。4、 最后比较两个颜色的sum，输出大的那个
 */
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
