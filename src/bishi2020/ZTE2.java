package bishi2020;

import java.util.Scanner;

public class ZTE2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            T--;
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = 1000000;
            if (n > 2) {
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        int cnt = Math.abs(x) + Math.abs(y);
                        int d = (a[1] + y) - (a[0] + x);
                        int a0 = a[0] + x;
                        boolean flag = true;
                        for (int i = 2; i < n; i++) {
                            int v = Math.abs(a0 + i * d - a[i]);
                            if (v > 1) {
                                flag = false;
                                break;
                            } else {
                                cnt += v;
                            }
                        }
                        if (flag) {
                            ans = Math.min(ans, cnt);
                        }
                    }
                }
                System.out.println(ans == 1000000 ? -1 : ans);
            } else {
                System.out.println(0);
            }
        }
    }
}
