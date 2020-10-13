package bishi2020;

public class huaweimianshi2 {

    public static void main(String[] args) {

        char[][] b = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
                };

        System.out.println(new huaweimianshi2().exist(b, "ABCCED"));
    }

    public boolean exist(char[][] board, String word) {
        int h = board.length;
        int w = board[0].length;
        boolean[][] visited = new boolean[h][w];

        for(int i = 0; i < h; i++){
            for (int j = 0 ; j < w; j++) {
                boolean flag = isValid(board, visited, i, j, word, 0);
                if(flag){
                    return true;
                }
            }
        }

        return false;

    }

    public boolean isValid(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
        if(board[i][j] != s.charAt(k)) {
            return false;
        }else if (k == s.length() - 1){
            return true;
        }

        visited[i][j] = true;
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        boolean res = false;
        for(int[] di: dir){
            int n_i = i + di[0];
            int n_j = j + di[1];
            if(n_i >= 0 && n_i < board.length && n_j >= 0 && n_j < board[0].length) {
                if(!visited[n_i][n_j]) {
                    boolean flag = isValid(board, visited,n_i,n_j, s,k+1);
                    if(flag) {
                        res = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;

        return res;
    }

}
