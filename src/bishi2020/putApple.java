package bishi2020;

import java.util.Scanner;

/**
 * m个苹果放在n个盘子里
 * 1、假设有一个盘子为空，则(m,n)问题转化为将m个苹果放在n-1个盘子上，即求得(m,n-1)即可
 * 2、假设所有盘子都装有苹果，则每个盘子上至少有一个苹果，即最多剩下m-n个苹果，问题转化为将m-n个苹果放到n个盘子上
 */
public class putApple {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(func(m, n));
    }

    public static int func(int m, int n){
        if(m < 0 || n < 0){
            return 0;
        }else if(m == 1 || n == 1){
            return 1;
        }else {
            return func(m, n-1) + func(m-n,n);
        }
    }
}
