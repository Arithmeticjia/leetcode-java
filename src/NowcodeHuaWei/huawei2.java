package NowcodeHuaWei;

import java.util.Arrays;

public class huawei2 {

    public static void main(String[] args) {
        char[][] b = {
                {'S','S','H','H','H'},
                {'S','S','H','H','H'},
                {'H','H','S','H','H'},
                {'H','H','H','S','S'},
        };
        int count = 0;
        System.out.print(Arrays.deepToString(b));
        for(int i = 0; i < 4;i++){
            for(int j = 0; j < 5;j++){
                if(b[i][j] == 'S'){
                    count++;
                }
            }
        }
        System.out.print(count);
    }

    int n, m;

    public void solve(char[][] board) {
        n = board.length;
        if (n == 0) {
            return;
        }
        m = board[0].length;
        for (int i = 0; i < n; i++) {
            dfs(board, i, 0);
            dfs(board, i, m - 1);
        }
        for (int i = 1; i < m - 1; i++) {
            dfs(board, 0, i);
            dfs(board, n - 1, i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'S';
                } else if (board[i][j] == 'S') {
                    board[i][j] = 'H';
                }
            }
        }
    }

    public void dfs(char[][] board, int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m || board[x][y] != 'S') {
            return;
        }
        board[x][y] = 'A';
        dfs(board, x + 1, y);
        dfs(board, x - 1, y);
        dfs(board, x, y + 1);
        dfs(board, x, y - 1);
    }
}


