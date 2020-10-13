package bishi2020;

import java.util.Scanner;

public class xiaomi1 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String[] passwords = in.nextLine().split(" ");
        in.close();

        for (String str : passwords) {
            if (str.length() < 8 || str.length() > 120) {
                System.out.println(1);
                continue;
            }
            boolean[] status = new boolean[4];
            for (int i = 0; i < str.length(); ++i) {
                char c = str.charAt(i);
                if (c >= '0' && c <= '9') {
                    status[0] = true;
                } else if (c >= 'A' && c <= 'Z') {
                    status[1] = true;
                } else if (c >= 'a' && c <= 'z') {
                    status[2] = true;
                } else {
                    status[3] = true;
                }
            }
            boolean flag = status[0] && status[1] && status[2] && status[3];
            System.out.println(flag?0:2);
        }
    }

}
