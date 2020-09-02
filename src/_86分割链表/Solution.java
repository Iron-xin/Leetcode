package _86分割链表;

import java.util.Scanner;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead1 = new ListNode(0);
        ListNode dummyHead2 = new ListNode(0);
        ListNode node1 = dummyHead1;
        ListNode node2 = dummyHead2;
        //分成两个链表。注意要置为空，不然使得内存超出限制
        while (head != null) {
            if (head.val < x) {
                node1.next = head;
                head = head.next;
                node1 = node1.next;
                node1.next = null;
            } else {
                node2.next = head;
                head = head.next;
                node2 = node2.next;
                node2.next = null;
            }
        }
//        node1.next = null;
//        node2.next = null;移动到这里也可以
        node1.next = dummyHead2.next;
        return dummyHead1.next;
    }
}
