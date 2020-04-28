package com.company;

import java.util.Scanner;

public class qiniu22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        for(int t = 0;t < time;t++){
            String buffer = scanner.next();
            Class b = buffer.getClass();
            int i,len,j;
            len = buffer.length();
            char[] str = buffer.toCharArray();
            char[] ans = new char[100];
            str[0] = ans[0];
            j = 1;
            for(i = 1;i < len;i++){
                ans[j] = str[i];
                if(j >= 1 && ans[j] == ans[j-1]){
                    j -= 2;
                }
                j++;
            }
            ans[j]='\0';
            if(ans[0] == '\0'){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            System.out.println(ans);
        }
    }
}
