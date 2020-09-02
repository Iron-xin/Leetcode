package 剑指offer._18删除链表的节点;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            }
            prev = head;
            head = head.next;
        }
        return dummy.next;
    }
}
