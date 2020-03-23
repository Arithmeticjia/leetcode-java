package com.company;

import java.math.BigInteger;
import java.util.*;
//import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        String s = scan.next();
        BigInteger c = scan.nextBigInteger();
        List<Integer> list = getSequence(n, l);
    }

    public static List<Integer> getSequence(int n, int len) {
        //用来存放符合条件的序列
        List<Integer> list = new ArrayList<>();
        //先从最短的情况判断
        for (int i = len; i <= 100; i++) {
            //首先保证n要大于等于i * (i - 1) / 2
            //其次判断n和i * (i - 1) / 2的差是不是正好对当前元素的个数整除
            if ((n - i * (i - 1) / 2) >= 0 && (n - i * (i - 1) / 2) % i == 0) {
                int a = (n - i * (i - 1) / 2) / i;
                for (int j = 0; j < i; j++) {
                    list.add(a + j);
                }
                return list;
            }
        }
        return list;
    }
}
