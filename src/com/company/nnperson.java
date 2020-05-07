package com.company;

import java.util.Scanner;

public class nnperson {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入排成一圈的人数：");
        int n = s.nextInt();
//        System.out.print("请输入退出数：");
//        int m = s.nextInt();
        // 定义一个长度为n的boolean数组
        // true表示留下的人，false代表出局的人
        boolean[] arr = new boolean[n];
        // for循环赋值数组都是true
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        int persionLength = n;
        int countNum = 0;
        int index = 0;
        int m = 2;
        // 当只剩一个人的时候退出循环
        while (persionLength > 1) {
            if (arr[index] == true) {
                countNum++;
                // 当报数为m时
                if (countNum == m) {
                    // 重新开始
                    countNum = 0;
                    // 从队伍里剔除
                    arr[index] = false;
                    // 同步改变while判断条件
                    persionLength--;
                    m = m + 1;
                }
            }
            // 下标每次加1
            index++;
            // 如果下标为10，从头开始
            if (index == n) {
                index = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]) {
                System.out.println("原来排在第" + (i + 1) + "位的人留下了。");
            }
        }
    }
}


    