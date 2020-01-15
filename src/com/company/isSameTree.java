package com.company;

public class isSameTree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(1);
        mergeTwoLists test = new mergeTwoLists();
        isSameTree xxx = new isSameTree();
        System.out.println(xxx.isSameTree(l1,l2));

    }

    public boolean isSameTree(TreeNode p, TreeNode q){
        if (p ==  null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}