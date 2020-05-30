package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}*/

/**
 * 这里用了BFS深度优先搜索
 */
public class averageOfLevels {

    public List<Double> averageOfLevels(TreeNode root){

        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            long sum = 0;
            long count = 0;
            Queue < TreeNode > temp = new LinkedList < > ();
            while(!queue.isEmpty()){
                TreeNode n = queue.remove();
                sum += n.val;
                count++;
                if(n.left != null){
                    temp.add(n.left);
                }
                if(n.right != null){
                    temp.add(n.right);
                }
            }
            queue = temp;
            ans.add(sum * 1.0 /count);
        }
        return ans;
    }
}
