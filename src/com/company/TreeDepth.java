package com.company;

public class TreeDepth {

    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max((1 + TreeDepth(root.left)), (1 + TreeDepth(root.right)));
    }
}
