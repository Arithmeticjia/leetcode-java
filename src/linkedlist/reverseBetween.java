package linkedlist;

import com.company.ListNode;

public class reverseBetween {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        // 开始移动node
        ListNode node = ans;
        for(int i = 1;i < m;i++){
            node = node.next;
        }

        //反转开始结点
        ListNode newHead = node.next;
        ListNode preNode = null;
        ListNode nextNode = null;

        for(int i = 0;i < n - m + 1;i++){
            nextNode = newHead.next;
            newHead.next = preNode;
            preNode = newHead;
            newHead = nextNode;
        }

        //反转完毕，nextNode就是反转部分的后一个
        //这两步不能反过来
        node.next.next = nextNode;
        // preNode就是反转完成后的头节点
        node.next = preNode;

        return ans.next;
    }
}
