package com.company;

/**
 * DP（动态规划）
 * 对于每个点，值为0距离为0，
 * 值不为0，则值为上下左右点最小的那个加1
 */
public class updateMatrix {

    public int[][] updateMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        // 第一遍遍历，从左上到右下，比较上面和左边中较小的值
        // matrix[i][j]代表第(i,j)个点距离0最短的距离
        // 毫无疑问，所有的0的位置一定都是0
        // 所有1的位置初始化为一个大于1的数(便于后面比较)
        // dp[i][j] = min(dp[i][j],min(dp[i-1][j],dp[i][j-1])+1)
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                if(matrix[i][j] == 1){
                    matrix[i][j] = row + col;
                }
                if(i > 0){
                    matrix[i][j] = Math.min(matrix[i][j],matrix[i-1][j] + 1);
                }
                if(j > 0){
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][j - 1] + 1);
                }
            }
        }
        // 第二次遍历，反向遍历，根据相邻右元素和下元素及当前元素的结果得出最终结果
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (i < row - 1) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i + 1][j] + 1);
                }
                if (j < col - 1) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][j + 1] + 1);
                }
            }
        }
        return matrix;
    }
}
