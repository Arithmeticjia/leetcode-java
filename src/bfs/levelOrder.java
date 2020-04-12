package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {

    public List<List<Integer>> levelOrder(TreeNode root){
        // 定义二维数组形式的返回值
        List<List<Integer>> ans = new ArrayList<>();
        // 特判
        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while(!queue.isEmpty()){

            ans.add(new ArrayList<>());
            int levelLength = queue.size();
            // 遍历每一层
            for(int i = 0;i < levelLength;i++){
                // 移除并返回队列头部第一个元素
                TreeNode node = queue.remove();
                // 添加每一层的节点值
                ans.get(level).add(node.val);
                // 把下一层的放到队列里
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                level++;
            }
        }
        return ans;
    }
}
