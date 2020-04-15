package bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * bfs深度优先搜索
 */
public class updateMatrix {

    public int[][] updateMatrix(int[][] matrix){
        if(matrix.length == 0 || matrix == null){
            return null;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0;i < m;i++){
            for(int j = 0; j < n;j++){
                if(matrix[i][j] == 0){
                    res[i][j] = 0;
                    visited[i][j] = true;
                    queue.offer(new int[]{i,j});
                }
            }
        }
        int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};//上下左右
        while(!queue.isEmpty()){
            int[] node = queue.poll();
            int i = node[0],j = node[1];
            // 四个方向
            for(int k = 0;k < 4;k++){
                int di = i + direction[k][0];
                int dj = j + direction[k][1];
                // 如果坐标合法并且没有被访问过
                if(di >= 0 && di < m && dj>=0 && dj < n && !visited[di][dj]){
                    // 此时的res[i][j]一定是0
                    // 算出四个方向上距离res[i][j]这个0的距离，肯定都是1
                    res[di][dj] = res[i][j] + 1;
                    visited[di][dj] = true;
                    queue.offer(new int[]{di, dj});
                }
            }
        }
        return res;
    }
}
