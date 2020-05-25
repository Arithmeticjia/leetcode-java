package com.company;

/**
 * 等差数列划分
 * A = [1, 2, 3, 4]
 *
 * 返回: 3, A 中有三个子等差数组: [1, 2, 3], [2, 3, 4] 以及自身 [1, 2, 3, 4]。
 */
public class numberOfArithmeticSlices {

    public static void main(String[] args) {
        int[] A = {1,3,5,7};
        System.out.println(numberOfArithmeticSlices.numberOfArithmeticSlices(A));
        numberOfArithmeticSlices.numberOfArithmeticSlices(A);
    }

    public static int numberOfArithmeticSlices(int[] A) {
        // 计数
        int count = 0;
        //
        for (int s = 0; s < A.length - 2; s++) {
            // 后一个数和前一个数的差
            int d = A[s + 1] - A[s];
            // 从第三个数开始
            for (int e = s + 2; e < A.length; e++) {
                int i = 0;
                // e是等差数列的最后一个数
                for (i = s + 1; i <= e; i++) {
                    // 遍历第一个和最后一个数之间所有的差
                    if (A[i] - A[i - 1] != d) {
                        break;
                    }
                }
                // 没有break的话 最后一次i++一定大于e
                if (i > e) {
                    count++;
                }
            }
        }
        return count;
    }
}
