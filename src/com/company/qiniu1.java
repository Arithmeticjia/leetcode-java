package com.company;

import java.util.Scanner;

public class qiniu1{
    static int[] root;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            root = new int[n+1];
            for(int i = 0;i <= n;i++){
                root[i] = -1;
            }
            for(int i=0;i<m;i++){
                int x = in.nextInt();
                int y = in.nextInt();
                int a = findRoot(x);
                int b = findRoot(y);
                if(a!=b){
                    root[a] = b;
                }
            }
            int count = 0;
            for(int i = 1;i <= n;i++)
                if(root[i] == -1) count++;

            if(count == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static int findRoot(int x){
        if(root[x] == -1){
            return x;
        }
        int temp = findRoot(root[x]);
        root[x] = temp;
        return temp;
    }
}
