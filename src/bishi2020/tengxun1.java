package bishi2020;

import java.util.*;

public class tengxun1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }

        if(m == n){
            for(int i = 0; i < n-1;i++){
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        }

        for(int i = 0; i < n;i++){
            if(i != m-1) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        }

        System.out.print(Arrays.toString(arr));

//        ListNode sentinel = new ListNode(0);
//        sentinel.next = head;
//
//        ListNode prev = sentinel, curr = head;
//        while (curr != null) {
//            if (curr.val == val) prev.next = curr.next;
//            else prev = curr;
//            curr = curr.next;
//        }
//        return sentinel.next;

    }
}

