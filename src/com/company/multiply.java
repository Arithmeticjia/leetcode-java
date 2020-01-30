package com.company;

import java.util.Arrays;

public class multiply {

    public static void main(String[] args){
        multiply test = new multiply();
        System.out.println(test.multiply("123","456"));
    }

    /*
     * 计算形式
     *    num1
     *  x num2
     *  ------
     *  result
     */


    public String multiply(String num1, String num2) {
        if(num1 == null || num1.length() == 0)
            return "0";
        if("0".equals(num1) || "0".equals(num2))
            return "0";

        String[] results = new String[num1.length()];
        for(int i = num1.length() - 1; i >= 0; i --) {
            int n1Val = num1.charAt(i) - '0';
            int carry = 0;
            // cur存放第一行每一个数和第二行的每一个数的乘积的值，包括进位
            StringBuilder cur = new StringBuilder();
            for(int j = num2.length() - 1; j >= 0; j --) {
                int n2Val = num2.charAt(j) - '0';
                int sum = carry + n1Val * n2Val;
                // 进位
                carry = sum / 10;
                // 值
                cur.append(sum % 10);
            }

            cur.append(carry != 0 ? carry : "");
            results[i] = cur.reverse().append(generateZero(num1.length() - i - 1)).toString();
        }

        // 这一部分融合操作可以优化成 分治 算法，效率更高。
        // 类似于合并 k 个有序链表。
        // 这里简单起见，我并没有优化，感兴趣的同学可以做一下优化。
        String res = results[0];
        for(int i = 1; i < results.length; i ++) {
            res = addStrings(res, results[i]);
        }

        return res;
}

    private String generateZero(int n) {
        char[] zeros = new char[n];
        Arrays.fill(zeros, '0');
        return new String(zeros);
    }

    private String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int num1Val = i >= 0 ? num1.charAt(i) - '0' : 0;
            int num2Val = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = carry + num1Val + num2Val;
            carry = sum / 10;

            res.append(sum % 10);

            if (i >= 0) i--;
            if (j >= 0) j--;
        }

        return res.reverse().toString();
    }
}
