package com.company;

public class mergeTwoLists {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        mergeTwoLists test = new mergeTwoLists();
        ListNode r = test.mergeTwoLists(l1,l2);
        test.print_result(r);
    }

    // Print ListNode
    public void print_result(ListNode l){
        while (l != null){
            System.out.print(l.val);
            l = l.next;
            if (l != null)
                System.out.print("->");
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode p = new ListNode(-1);
        ListNode head = p;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p=p.next;
        }
        //如果l1和l2不一样长，等遍历完后，将p的next指向没遍历完的链表即可
        //比如l1长度是3，1->2->3，l2长度是5 1->2->3->8->9
        //等循环结束时，l1就指向8->9，只要将p.next指向8->9即可
        p.next = (l1 == null ? l2 : l1);
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}