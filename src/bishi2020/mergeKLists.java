package bishi2020;
import java.util.*;

/**
 * 合并K个已排序的链表
 */
public class mergeKLists {

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists.size() == 0) {
            return null;
        }
        ListNode head = lists.get(0);
        for (int i = 1; i < lists.size(); i ++ ) {
            head = helper(head, lists.get(i));
        }
        return head;
    }
    //合并两个有序链表
    public static ListNode helper(ListNode head1, ListNode head2) {
        ListNode tmp = new ListNode(0), p = tmp;
        while (head1 != null && head2 != null) {
            if(head1.val < head2.val) {
                p.next = head1;
                head1 = head1.next;
            } else {
                p.next = head2;
                head2 = head2.next;
            }
            p = p.next;
        }
        p.next = (head1 == null) ? head2 : head1;
        return tmp.next;
    }
}
