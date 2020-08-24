package treenode;

import java.util.Stack;

/**
 * 判断是否是儿叉搜索树
 * BFS
 */
public class isValidBST {

    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //为啥用Integer？看用例，用例是0就用int
        Integer curValue = null;
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                //这是最早被pop()出去的，相当于整个二叉树的最左边的叶子节点
                //所以要判断不等于null
                if(curValue != null && cur.val <= curValue) {
                    return false;
                }
                curValue = cur.val;
                cur = cur.right;
            }
        }
        return true;
    }
}
