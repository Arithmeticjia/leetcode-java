package linkedlist;

import com.company.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * leetcode 86 分隔链表
 *
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * 你应当保留两个分区中每个节点的初始相对位置。
 *
 * 输入: head = 1->4->3->2->5->2, x = 3
 * 输出: 1->2->2->4->3->5
 */
public class partition {
    public ListNode partition(ListNode head, int x) {
        //链表less记录小于x的元素
        ListNode less = new ListNode(0);
        ListNode lessP = less;
        //链表more记录大于等于x的元素
        ListNode more = new ListNode(0);
        ListNode moreP = more;
        //移动head
        while (head != null) {
            if (head.val < x) {
                lessP.next = head;
                lessP = head;
            } else {
                moreP.next = head;
                moreP = head;
            }
            head = head.next;
        }
        moreP.next = null;
        //拼接两段链表
        lessP.next = more.next;
        return less.next;
    }
}