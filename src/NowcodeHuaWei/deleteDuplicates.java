package NowcodeHuaWei;

import com.company.ListNode;

public class deleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        //新建一个头结点
        ListNode newHead = new ListNode(head.val-1);
        newHead.next = head;
        //移动这个
        ListNode cur = head;
        ListNode last = newHead;
        while(cur != null && cur.next != null){

            if(cur.val != cur.next.val){
                last = cur;
            }else{
                while(cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                last.next = cur.next;
            }
            cur = cur.next;
        }
        return newHead.next;
    }
}
