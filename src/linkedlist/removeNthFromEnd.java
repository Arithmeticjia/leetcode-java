package linkedlist;

/**
 * 删除链表倒数第n个节点
 */
public class removeNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode fast = node;
        ListNode slow = node;
        for(int i = 0; i <= n;i++){
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return node.next;
    }
}
