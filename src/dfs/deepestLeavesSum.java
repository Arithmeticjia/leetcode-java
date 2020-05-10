package dfs;



/**
 * 层数最深叶子节点的和
 * dfs
 */
public class deepestLeavesSum {
    int sum=0;
    int deepest=0;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root,0);
        return sum;
    }

    public void dfs(TreeNode node, int level){
        if(node == null){
            return;
        }
        if(node.left == null || node.right == null){
            if(level > deepest){
                sum = node.val;
                deepest = level;
            }else if(level == deepest){
                sum += node.val;
            }else {

            }
        }
        dfs(node.left,level+1);
        dfs(node.right,level+1);
    }
}
