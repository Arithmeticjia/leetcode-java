package treenode;

/**
 * 687. 最长同值路径
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 */

public class longestUnivaluePath {

    int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }

    // 从节点node出发相同值最长的路径（单边），非左+根+右这样的结构
    public int arrowLength(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0, arrowRight = 0;
        // 发现当前节点的值和左孩子的值相等，那么构成一条边
        if (node.left != null && node.left.val == node.val) {
            arrowLeft = left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight = right + 1;
        }
        // 左边的单边长度+右边的单边长度，构成该节点的最大长度
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
}
