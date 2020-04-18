package linkedlist;

import com.company.ListNode;

import java.util.List;

public class removeElements {
    public ListNode removeElements(ListNode head, int val){
        // 哨兵
        ListNode solider = new ListNode(-1);
        solider.next = head;

        ListNode prev = solider;
        ListNode curr = head;
        while (curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }else {
                prev = curr;
            }
            // 当前的不断往后移
            curr = curr.next;
        }

        return solider.next;

    }

}
