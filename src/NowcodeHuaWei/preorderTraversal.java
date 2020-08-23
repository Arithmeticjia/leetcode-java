package NowcodeHuaWei;


import java.util.ArrayList;


/**
 * 二叉树前序遍历
 */
public class preorderTraversal {

    public static void main(String[] args) {

        TreeNode t = new TreeNode(1);

        System.out.print(new preorderTraversal().preorderTraversal(t));

    }

    static ArrayList<Integer> res = new ArrayList<>();

    public ArrayList<Integer> preorderTraversal (TreeNode root) {
        // write code here

        if(root == null){
            return res;
        }
        dfs(root);

        return res;
    }

    public static void dfs(TreeNode root){
        if(root != null){
            res.add(root.val);
            dfs(root.left);
            dfs(root.right);
        }
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int i) {
        this.val = i;
    }
}