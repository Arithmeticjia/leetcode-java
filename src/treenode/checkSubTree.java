package treenode;

public class checkSubTree {

    public boolean checkSubTree(TreeNode t1, TreeNode t2){

        if(t1 == null){
            return t2 == null;
        }

        return isSame(t1,t2) || checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
    }

    private boolean isSame(TreeNode t1, TreeNode t2) {

        if(t1 == null && t2 == null){
            return true;
        }

        if(t1 == null || t2 == null){
            return false;
        }
        // 两个都不是空
        return t1.val == t2.val && isSame(t1.right, t2.right) && isSame(t1.left, t2.left);
    }
}
