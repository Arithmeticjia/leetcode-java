package dfs;

public class diameterOfBinaryTree {
    int ans;
    public int diameterOfBinaryTree(TreeNode root){
        ans = 0;
        depth(root);
        return ans;
    }

    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int L = depth(root.left);
        int R = depth(root.right);
        ans = Math.max(ans, L + R);
        return Math.max(L, R) + 1;
    }

}
