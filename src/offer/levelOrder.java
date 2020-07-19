package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 */
public class levelOrder {

    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }

        int[] res = new int[ans.size()];
        for (int i = 0;i < ans.size();i++){
            res[i] = ans.get(i);
        }

        return res;
    }
}
