package readblacktree;

public class ReadBlackTree {

    private final int R = 0;
    private final int B = 1;
    private Node root = null;

    class Node{

        int data;
        int color = R;
        Node left;
        Node right;
        Node parent;

        public Node(int data){
            this.data = data;
        }

    }

    public void insert(Node root,int data){
        if(root.data < data){
            if(root.right == null){
                root.right = new Node(data);
            }else{
                insert(root.right, data);
            }
        }else {
            if(root.left == null){
                root.left = new Node(data);
            }else{
                insert(root.left, data);
            }
        }
    }

    public void leftRotate(Node node){
        //根节点
        if(node.parent == null){
            // E左，S右
            Node E = root;
            Node S = E.right;
            // 修改E指针
            E.right = S.left;
            S.left.parent = E;
            // 修改S指针
            E.parent = S;
            S.parent = null;
        }
    }
}
