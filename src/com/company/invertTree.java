package com.company;

public class invertTree {

    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = left;
        root.right = right;
        return root;
    }
}
