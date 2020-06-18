package treenode;

import java.util.Stack;

/**
 * 538. 把二叉搜索树转换为累加树，每个节点的值是当前节点+比他大的节点之和
 * 方法一，反向中序遍历，中序遍历是左根右，反向就是右根左，同时把每个节点的值更新累加和
 */
public class convertBST {

    int sum = 0;

    public TreeNode convertBST(TreeNode root){
        if(root != null){
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }

        return root;
    }

    public TreeNode convertBST2(TreeNode root) {
        int sum = 0;
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (!stack.isEmpty() || node != null) {
            /* push all nodes up to (and including) this subtree's maximum on
             * the stack. */
            while (node != null) {
                stack.add(node);
                node = node.right;
            }

            node = stack.pop();
            sum += node.val;
            node.val = sum;

            /* all nodes with values between the current and its parent lie in
             * the left subtree. */
            node = node.left;
        }

        return root;
    }

}
