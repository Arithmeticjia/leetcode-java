package linkedlist;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 剑指 Offer 18. 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点
 */
public class deleteNode {

    public ListNode deleteNode(ListNode head, int val){
        ListNode pre = head, cur = head.next;

        if(head.val == val){
            return head.next;
        }

        while(cur != null && cur.val != val){
            pre = cur;
            cur = cur.next;
        }

        if(cur != null){
            pre.next = cur.next;
        }

        return head;
    }

}
