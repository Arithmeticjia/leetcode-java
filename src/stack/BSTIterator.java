package stack;

import treenode.TreeNode;

import java.util.Stack;


/**
 * 173. 二叉搜索树迭代器
 * 实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。
 *
 * 调用 next() 将返回二叉搜索树中的下一个最小的数。
 */
public class BSTIterator {

    Stack<TreeNode> nodeStack = null;

    public BSTIterator(TreeNode root){
        nodeStack = new Stack<>();
        while(root != null){
            nodeStack.push(root);
            root = root.left;
        }
    }


    /**
     * 按照左根右的顺序pop()
     * @return the next smallest number
     */
    public int next() {
        // 保留节点
        TreeNode node = nodeStack.peek();
        // pop出去
        nodeStack.pop();

        TreeNode tmp = node.right;
        while (null != tmp)
        {
            nodeStack.push(tmp);
            tmp = tmp.left;
        }

        return node.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return  !nodeStack.isEmpty();
    }
}
