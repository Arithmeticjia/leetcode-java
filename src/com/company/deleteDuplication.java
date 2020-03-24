package com.company;

public class deleteDuplication {

    public static void main(String[] args) {
        deleteDuplication test = new deleteDuplication();
        ListNode x1 = new ListNode(1);
        ListNode x2 = new ListNode(2);
        ListNode x3 = new ListNode(3);
        ListNode x4 = new ListNode(3);
        ListNode x5 = new ListNode(4);
        ListNode x6 = new ListNode(4);
        ListNode x7 = new ListNode(5);
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x6;
        x6.next = x7;
        test.printListNode(x1);
        System.out.print("\n");
        test.printListNode(test.deleteDuplication(x1));
        System.out.print("\n");


    }

    public void printListNode(ListNode listNode){
        while(listNode != null){
            System.out.print(listNode.val);
            listNode = listNode.next;
            if(listNode != null){
                System.out.print("->");
            }
        }
    }

    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null){
            return pHead;
        }
        // 创建了一个引用变量firstNode指向对象
        ListNode firstNode = new ListNode(-1);
        // pHead是另一个引用变量
        firstNode.next = pHead;
        ListNode preHead = firstNode;
        ListNode p = pHead;
        while ((null != p) && (null != p.next)) {
            // 若结点值出现重复
            if (p.val == p.next.val) {
                int val = p.val;
                // 删除重复结点
                while ((null != p) && (val == p.val)) {
                    p = p.next;
                }
                // 删除重复结点后，进行链接
                preHead.next = p;
            } else {
                // 结点不重复，后移
                preHead = p;
                p = p.next;
            }
        }
        return firstNode.next;
    }
}
