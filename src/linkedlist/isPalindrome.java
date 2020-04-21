package linkedlist;

import com.company.ListNode;

public class isPalindrome {

    public boolean isPalindrome(ListNode head){

        if(head == null || head.next == null){
            return true;
        }

        ListNode p = new ListNode(-1);

        ListNode fast = p;
        ListNode low = p;
        p.next = head;

        while(fast != null && fast.next != null){
            low = low.next;
            fast = fast.next.next;
        }

        // 从慢指针往后的开始反转
        ListNode cur = low.next;
        ListNode pre = null;
        low.next = null;
        low = p.next;

        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        while(pre != null){
            if(low.val != pre.val){
                return false;
            }
            low = low.next;
            pre = pre.next;
        }
        return true;
    }

}
