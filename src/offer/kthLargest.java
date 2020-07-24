package offer;


/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 */
public class kthLargest {

    int res, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.right);
        if(k == 0){
            return;
        }
        if(--k == 0){
            res = root.val;
        }
        dfs(root.left);
    }
}
