package com.company;

/**
 * 面试题 05.06. 整数转换
 */
public class convertInteger {

    public int convertInteger(int A, int B) {

        System.out.println(A ^ B);
        // 统计1的个数
        // 异或：相同为0 不同为1
        return Integer.bitCount(A ^ B);
    }

    public static void main(String[] args) {
        convertInteger convertInteger = new convertInteger();
        convertInteger.convertInteger(1,2);
    }
}
