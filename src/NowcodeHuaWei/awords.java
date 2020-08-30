package NowcodeHuaWei;

/**
 * 奖品
 * 公司最近需要购进一批纪念品作为奖品，经过调查他们确定了两种纪念品，
 * 两种的价钱分别是A和B，而公司用来购买纪念品的资金为n，
 * 现在经理想知道有多少购买方案，能使得资金全部用完，而且两种纪念品至少有一个。
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 *
 * If you define many classes, but you must have a class named Main and a public property.
 * The Main class should be the only public class.
 * The Main class must contain a static method (function) named "main"
 * Do not add any package, like "package main"
 *
 * The TestCase is shown below
 * Input : 1 2
 * Output : 3
 */

class awords {
    public static void main(String[] args) {
        int n, a, b;
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            n = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            getMethodNum(n,a,b);
        }
    }

    public static int getMethodNum(int N,int A, int B) {
        int i = 1, j=1;
        int res = 0;
        return getMethodNumHelp(N, A, B, i, j, res);
    }

    private static int getMethodNumHelp(int N,int A, int B, int i ,int j, int res) {
        if ((i * A  + j * B) > N) {
            return res;
        }
        if ((i * A  + j * B) == N) {
            res += 1;
            getMethodNumHelp(N, A, B, i - 1, j, res);
        }
        getMethodNumHelp(N, A, B, i + 1, j, res);
        return res;
    }
}