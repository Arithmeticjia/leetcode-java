package offer;

import com.company.ListNode;

import java.util.ArrayList;
import java.util.List;

public class isPalindrome {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(-129);
        ListNode node2 = new ListNode(-129);
        node1.next = node2;
        System.out.println(new isPalindrome().isPalindrome(node1));
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        for(int i=0;i<list.size() / 2 ;i++)
        {
            if(!list.get(i).equals(list.get(list.size() - i - 1))){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeP(ListNode head) {
        // 快慢指针找中点
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 反转后半部分
        ListNode pre = null;
        ListNode next;
        while (slow != null) {
            next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        // 前后两段比较是否一致
        ListNode node = head;
        while (pre != null) {
            if (pre.val != node.val) {
                return false;
            }
            pre = pre.next;
            node = node.next;
        }
        return true;
    }
}
