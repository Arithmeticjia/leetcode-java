package com.company;
import java.util.ArrayList;

public class PrintFromTopToBottom {

    public static void main(String[] args){
        PrintFromTopToBottom test = new PrintFromTopToBottom();
        TreeNode l1 = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);
        TreeNode l4 = new TreeNode(4);
        TreeNode l5 = new TreeNode(5);
        TreeNode l6 = new TreeNode(6);
        l1.left = l2;
        l2.right = l3;
        l3.left = l4;
        l3.right = l5;
        l5.right = l6;
        System.out.println(test.PrintFromTopToBottom(l1));
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if(root == null)
            return list;
        queue.add(root);
        while(queue.size() != 0){
            TreeNode t = queue.remove(0);
            if(t.left != null){
                queue.add(t.left);
            }
            if(t.right != null){
                queue.add(t.right);
            }
            list.add(t.val);
        }
        return list;
    }
}
