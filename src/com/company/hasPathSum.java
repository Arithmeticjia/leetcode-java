package com.company;

public class hasPathSum {

    /*
        1
       / \
      2   3

    */

    public static void main(String[] args){
        hasPathSum test = new hasPathSum();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        System.out.println(test.hasPathSum(t1,4));
    }

    public  boolean hasPathSum(TreeNode root, int sum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return sum - root.val == 0;
        }
        return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
