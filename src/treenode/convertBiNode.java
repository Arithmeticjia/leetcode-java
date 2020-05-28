package treenode;

public class convertBiNode {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t2.left = t1;
        t2.right = t3;

        convertBiNode test = new convertBiNode();
        test.convertBiNode(t2);
    }



    //    public TreeNode convertBiNode(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        // 左
//        TreeNode subRoot = convertBiNode(root.left);
//        if (subRoot == null) {
//            subRoot = root;
//        } else {
//            TreeNode subRootTmp = subRoot;
//            while (subRoot.right != null) {
//                subRoot = subRoot.right;
//            }
//            subRoot.right = root;
//            subRoot = subRootTmp;
//        }
//        root.left = null;
//        // 右
//        root.right = convertBiNode(root.right);
//        return subRoot;
//    }

    // 定义一个全局头指针
    // 不断移动
    TreeNode rootNode;

    public TreeNode convertBiNode(TreeNode root) {
        //头指针实例化
        rootNode = new TreeNode(0);

        //备份这个头指针
        TreeNode headNode = rootNode;
        // 开始中序遍历
        midOrderRe(root);

        //返回二叉树的第一个节点
        return headNode.right;
    }

    public void midOrderRe(TreeNode r) {
        //跳出递归的条件
        if (r == null) {
            return;
        }
        //中序遍历，根左右
        midOrderRe(r.left);
        //将root放入链表最后
        rootNode.right = r;
        //将二叉树中节点原有的left置空
        r.left = null;
        //头指针不断移动
        rootNode = rootNode.right;
        midOrderRe(r.right);
    }
}
