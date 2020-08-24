package treenode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树右视图
 */
public class rightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){

            int size = queue.size();

            for(int i = 0; i < size;i++){
                TreeNode node = queue.poll();

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }

                if(i == size - 1){
                    res.add(node.val);
                }
            }
        }

        return res;

    }
}
