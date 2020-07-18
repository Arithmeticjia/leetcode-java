package linkedlist;

/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 * 假设第一个链表长度L1,第二个链表长度L2，那么两个链表都走L1+L2就会相遇
 */
public class getIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA, node2 = headB;
        while(node1 != node2){
            if(node1 != null){
                node1 = node1.next;
            }else{
                node1 = headB;
            }

            if(node2 != null){
                node2 = node2.next;
            }else{
                node2 = headA;
            }
        }

        return node1;
    }
}
