package bishi2020;

import java.util.*;

/**
 * M * N
 * 有水的'S'
 * 没水的'H'
 * 计算湖泊数量（被'H'和边界包围起来的若干个相邻'S'称为一个湖泊）
 *
 */
public class huawei22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mn = scanner.nextLine().split(",");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        int[][] arr = new int[m][n];
        for (int i = 0;i < m;i++){
            String str = scanner.nextLine();
            for (int j = 0; j < n;j++){
                if (str.charAt(j)=='S'){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }
        int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < m;i++){
            for (int j = 0; j < n;j++){
                if (arr[i][j]==1){
                    count++;
                    queue.offer(new int[]{i,j});
                    arr[i][j] = 0;
                    while(!queue.isEmpty()){
                        int[] cur = queue.poll();
                        for (int k = 0;k < 4;k++){
                            int n_x = cur[0] + dir[k][0];
                            int n_y = cur[1] + dir[k][1];
                            if (n_x < m && n_x >= 0 && n_y < n && n_y >= 0 && arr[n_x][n_y] == 1){
                                queue.offer(new int[]{n_x,n_y});
                                arr[n_x][n_y] = 0;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
