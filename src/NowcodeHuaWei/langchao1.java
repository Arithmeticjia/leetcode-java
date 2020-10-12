package NowcodeHuaWei;


import java.util.Scanner;

/**
 * 沙滩摆放着一排大小不一的球形石头，已知第i个石头的半径为ri，不存在两个石头半径相等。
 * 现要求通过移动石头使摆放的石头从左往右半径递增。每次可选择一块石头，并把它放在剩下n-1块石头的最左边或最右边。求最少操作次数。
 * 第一行一个整数n，表示石头个数。（1 <= n <= 100000）.
 * 第二行n个整数，表示从左往右石头的半径r1，r2，…，rn（ 1<= ri <= n）。
 * 保证不存在两个不同的石头半径相等。
 * 只需求出最大递增1的子序列长度，再用总长度减去子序列长度，即为需移动数目
 */
public class langchao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=1,max=1;
        while(sc.hasNext()){
            int stone = sc.nextInt();
            int[] arr = new int[stone];
            int[] n_arr = new int[stone];
            for(int i = 0;i < stone;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0;i < stone;i++){
                n_arr[i] = arr[i];
                for(int j = i + 1;j < stone;j++){
                    n_arr[j] = arr[j];
                    if(n_arr[i] + 1 == n_arr[j]){
                        num += 1;
                        n_arr[i] = n_arr[j];
                    }
                }
                if(num > max){
                    max = num;
                }
                num = 1;
            }
            System.out.println(stone-max);
        }
    }
}

