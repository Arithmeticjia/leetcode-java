package com.company;

//1->2->3->4
//2->1->4->3
public class swapPairs {

    public static void main(String[] args){
        swapPairs test = new swapPairs();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode ans = test.swapPairs(l1);
        test.print_result(ans);
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

    public ListNode swapPairs(ListNode head){


        if((head == null) || (head.next == null)){
            return head;
        }

        ListNode secondNode = head.next;

        head.next = swapPairs(secondNode.next);
        secondNode.next = head;

        return secondNode;
    }

}


