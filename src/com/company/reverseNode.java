package com.company;

import java.util.Stack;

public class reverseNode {

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        reverseNode(l1);
    }

    public static void print_result(ListNode l){
        while (l != null){
            System.out.print(l.val);
            l = l.next;
            if (l != null) {
                System.out.print("->");
            }
        }
    }

    // 逆序打印
    public static void reverseNode(ListNode headNode){
        if(headNode.next == null){
            return;// 空列表，不可以打印
        }

        Stack<ListNode> person = new Stack<>();
        // 压栈
        ListNode cur = headNode;
        while( cur != null){
            person.push(cur);
            cur = cur.next;
        }
        // 打印
        ListNode ans = null;
        ListNode pre = null;

        while(person.size() > 0){
            pre = person.pop();
            pre.next = ans;
            
        }
        print_result(ans);

    }
}
