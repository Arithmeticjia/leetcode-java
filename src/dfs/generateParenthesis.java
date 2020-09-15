package dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 08.09. 括号
 * 字符串只能从左往右加
 * 所以一旦left < right就要剪枝
 */
public class generateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(n, "", res, 0, 0);
        return res;
    }

    public void dfs(int n, String sub, List<String> res,int left, int right){
        if(left == n && right == n){
            res.add(sub);
            return;
        }
        if(left < right){
            return;
        }
        if(left < n){
            dfs(n,sub + "(", res, left+1,right);
        }
        if(right < n){
            dfs(n,sub + ")", res, left,right+1);
        }
    }

}
