package bishi2020;

import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class weiju1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类
     * @return int整型ArrayList
     */
    public ArrayList<Integer> postOrderFast (TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        TreeNode node = root;
        ArrayList<Integer> ret = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            // 后序遍历
            // 如果没有右孩子或者右孩子被访问过了 {@Alex Zheng 感谢建议哈～}
            if (node.right == null ||
                    (ret.size() != 0 && ret.get(ret.size() - 1).equals(node.right.val)) ) {
                ret.add(node.val);
                node = null;
            }  else {
                stack.push(node);
                node = node.right;
            }
        }
        return ret;
    }
}






