package dfs;

/**
 * 剑指 Offer 12. 矩阵中的路径
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * DFS+剪枝
 */
public class exist {
    public boolean exist(char[][] board, String word){
        char[] words = word.toCharArray();
        for (int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                if(dfs(board,words,i,j,0)){
                    return true;
                }
            }
        }

        return false;
    }

    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) {
            return false;
        }
        if(k == word.length - 1) {
            return true;
        }
        char tmp = board[i][j];
        // 标记当前矩阵元素： 将 board[i][j] 值暂存于变量 tmp ，并修改为字符 '/'
        // 代表此元素已访问过，防止之后搜索时重复访问。
        board[i][j] = '/';
        // 搜索下一单元格： 朝当前元素的 上、下、左、右 四个方向开启下层递归，
        // 使用 或 连接 （代表只需一条可行路径） ，并记录结果至 res 。
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i , j - 1, k + 1);
        // 还原当前矩阵元素： 将 tmp 暂存值还原至 board[i][j] 元素。
        board[i][j] = tmp;
        return res;
    }
}
