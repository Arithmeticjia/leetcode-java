package com.company;

public class getKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k){

        ListNode before = head,after = head;
        for(int i = 0;i < k;i++){
            before = before.next;
        }
        while(before!=null){
            after = after.next;
            before = before.next;
        }
        return after;
    }
}
