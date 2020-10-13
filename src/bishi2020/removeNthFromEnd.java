package bishi2020;

/**
 * 删除链表的倒数第n个节点
 **/
public class removeNthFromEnd {

    public ListNode removeNthFromEnd (ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        while(n-- > 1){
            fast = fast.next;
        }

        ListNode pre = null;
        while(fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        //pre就是待删除的前一个节点
        if(pre != null) {
            pre.next = slow.next;
        } else {
            //考虑删除头节点的情况
            head = head.next;
        }
        return head;

    }
}
