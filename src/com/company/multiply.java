package com.company;

import java.util.Arrays;

public class multiply {

    public static void main(String[] args){
        multiply test = new multiply();
        System.out.println(test.multiply("456","123"));
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
            // 0->48;9->57
            // char ''
            // String ""
            int n1Val = num1.charAt(i) - '0';
            System.out.println(n1Val);
            int carry = 0;
            // cur存放第一行每一个数和第二行的每一个数的乘积的值，包括进位
            // StringBuilder存储字符串
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
            System.out.println(cur);
            // 837 516 294
            results[i] = cur.reverse().append(generateZero(num1.length() - i - 1)).toString();
            // 738 6150 49200
        }

        String res = results[0];
        for(int i = 1; i < results.length; i ++) {
            res = addStrings(res, results[i]);
        }

        return res;
}
    // 补0
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
