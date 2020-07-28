package offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
 */
public class levelOrder2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();

        List<List<Integer>> res = new ArrayList<>();
        if(root!=null){
            deque.add(root);
        }

        while(!deque.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            for(int i = deque.size(); i > 0; i--) {
                // 从左向右打印
                TreeNode node = deque.removeFirst();
                tmp.add(node.val);
                // 先左后右加入下层节点
                if(node.left != null) {
                    deque.addLast(node.left);
                }
                if(node.right != null) {
                    deque.addLast(node.right);
                }
            }
            res.add(tmp);
            if(deque.isEmpty()) {
                break; // 若为空则提前跳出
            }
            // 打印偶数层
            tmp = new ArrayList<>();
            for(int i = deque.size(); i > 0; i--) {
                // 从右向左打印
                TreeNode node = deque.removeLast();
                tmp.add(node.val);
                // 先右后左加入下层节点
                if(node.right != null) {
                    deque.addFirst(node.right);
                }
                if(node.left != null) {
                    deque.addFirst(node.left);
                }
            }
            res.add(tmp);
        }
        return res;

    }
}
