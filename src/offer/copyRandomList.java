package offer;

class Node{
    int val;
    Node next;
    Node random;

    public Node(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

/**
 * 剑指 Offer 35. 复杂链表的复制
 */
public class copyRandomList {

    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        copy(head);
        randomDirect(head);
        return reList(head);
    }

    //重新连接 链表
    private Node reList(Node head){
        Node curr = head;
        //用于返回的拷贝头节点
        Node res = curr.next;
        while (curr != null){
            //原节点的下一个节点
            Node next = curr.next.next;
            //拷贝节点
            Node curCopy = curr.next;
            //将原节点指向下一个原节点
            curr.next = next;
            //拷贝节点的下一个节点指向下一个原节点的下一个节点
            curCopy.next = next!=null?next.next:null;
            //将当前节点指向下一个原节点
            curr = next;
        }
        return res;
    }

    private void randomDirect(Node head) {
        while (head!=null){
            Node cloneNode = head.next;
            if(head.random!=null){
                Node direct = head.random;
                cloneNode.random = direct.next;
            }
            head = cloneNode.next;
        }
    }

    public void copy(Node head){
        while(head!=null){
            Node cloneNode = new Node(head.val);
            Node nextNode = head.next;
            head.next = cloneNode;
            cloneNode.next = nextNode;
            head = cloneNode.next;
        }
    }
}
