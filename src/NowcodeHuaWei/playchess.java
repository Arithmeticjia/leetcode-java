package NowcodeHuaWei;

public class playchess {

    public String playchess (String[] chessboard) {
        int n = chessboard.length;
        int m = chessboard[0].length();
        // 先将其转化为字符数组
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++){
            board[i] = chessboard[i].toCharArray();
        }
        // 当前位置的上方、下方、左方和右方
        int [][] dir = {{0,-1},{0,1},{-1,0},{1,0}};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                // 发现牛牛的将的位置
            {
                if (board[i][j] == 'j'){
                    // 判断牛牛将上下左右各方方向上的棋子，利用l更新牛牛将上（下左右）方第几个格子
                    for (int k = 0; k < 4; k++) {
                        for (int count = 0, x = i + dir[k][0], y = j + dir[k][1], l = 2;
                             x >= 0 && x < n && y >= 0 && y < m;
                             x = i + dir[k][0] * l, y = j + dir[k][1] * l, l++){
                            // l=2时，x=i/i+1/i-1 y=0/j+1/j-1  count 记录board[x][y] 与 board[i][j]中间棋子个数
                            if (((board[x][y] == 'B' || board[x][y] == 'J') && l == 2) ||
                                    (board[x][y] == 'P' && count == 1) ||
                                    (board[x][y] == 'C' && count == 0)){
                                return "Happy";
                            }
                            // 不是.时count++
                            if (board[x][y] !='.'){
                                count ++;
                            }
                            // count 大于1时 牛牛的将不会被吃掉
                            if (count > 1) {
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
        return "Sad";
    }
}
