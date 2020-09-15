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
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] num = new int[n];
            int[] type = new int[n];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
                type[i] = sc.nextInt();
                if (type[i] == 1) {
                    cnt++;
                }
            }
            //四个数组可以用两个treemap代替
            int[] n1 = new int[cnt];
            int[] t1 = new int[cnt];
            int[] n2 = new int[n - cnt];
            int[] t2 = new int[n - cnt];
            int top1 = 0, top2 = 0, t11 = 0, t22 = 0;
            for (int i = 0; i < n; i++) {
                if (type[i] == 1) {
                    n1[top1++] = num[i];
                    t1[t11++] = i + 1;//注意这里是从第1行开始的
                } else if (type[i] == 2) {
                    n2[top2++] = num[i];
                    t2[t22++] = i + 1;
                }
            }
            if (cnt < 3 && n - cnt < 3) {//没满足情况
                System.out.println("null");
                continue;
            }
            if (cnt < 3) {
                helper(n2, t2);
                System.out.println(t2[t2.length - 3] + " " + t2[t2.length - 2] + " " + t2[t2.length - 1]);
                System.out.println(2);
                System.out.println(n2[n2.length - 1] + n2[n2.length - 2] + n2[n2.length - 3]);

            } else if (n - cnt < 3) {
                helper(n1, t1);
                System.out.println(t1[t1.length - 3] + " " + t1[t1.length - 2] + " " + t1[t1.length - 1]);
                System.out.println(1);
                System.out.println(n1[n1.length - 1] + n1[n1.length - 2] + n1[n1.length - 3]);
            } else {//两个种类礼物的人都>=3
                helper(n2, t2);
                helper(n1, t1);
                if (n2[n2.length - 1] + n2[n2.length - 2] + n2[n2.length - 3] > n1[n1.length - 1] + n1[n1.length - 2] + n1[n1.length - 3]) {//比较总量谁大
                    System.out.println(t2[t2.length - 3] + " " + t2[t2.length - 2] + " " + t2[t2.length - 1]);
                    System.out.println(2);
                    System.out.println(n2[n2.length - 1] + n2[n2.length - 2] + n2[n2.length - 3]);
                } else if (n2[n2.length - 1] + n2[n2.length - 2] + n2[n2.length - 3] < n1[n1.length - 1] + n1[n1.length - 2] + n1[n1.length - 3]) {
                    System.out.println(t1[t1.length - 3] + " " + t1[t1.length - 2] + " " + t1[t1.length - 1]);
                    System.out.println(1);
                    System.out.println(n1[n1.length - 1] + n1[n1.length - 2] + n1[n1.length - 3]);
                } else {
                    if (t2[t2.length - 3] > t1[t1.length - 3]) {//总量相等比较序号
                        System.out.println(t1[t1.length - 3] + " " + t1[t1.length - 2] + " " + t1[t1.length - 1]);
                        System.out.println(1);
                        System.out.println(n1[n1.length - 1] + n1[n1.length - 2] + n1[n1.length - 3]);
                    } else {
                        System.out.println(t2[t2.length - 3] + " " + t2[t2.length - 2] + " " + t2[t2.length - 1]);
                        System.out.println(2);
                        System.out.println(n2[n2.length - 1] + n2[n2.length - 2] + n2[n2.length - 3]);
                    }
                }

            }
        }
    }
    public static void helper(int[] n,int[]t){//此过程完全可以用treemap自动完成
        for(int i=0;i<n.length;i++){
            for (int j = 0; j <n.length-i-1 ; j++) {
                if(n[j]>n[j+1]){
                    int t1 = n[j];
                    n[j] = n[j+1];
                    n[j+1]=t1;
                    int x = t[j];
                    t[j] = t[j+1];
                    t[j+1] = x;
                }
            }
        }
    }
}
