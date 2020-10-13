package bishi2020;

import java.util.Scanner;

public class baidu4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[m + 5];
        a[0] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n && i - j >= 2; j++) {
                a[i] = a[i] % mod + a[i - j] % mod;
            }
        }
        System.out.println(a[m] % mod);
    }
}