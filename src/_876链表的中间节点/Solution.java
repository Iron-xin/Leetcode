package _876链表的中间节点;

public class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null)
            return null;
        ListNode slow = head;
        ListNode quick = head;
        //注意是两个判空条件
        while(quick!=null && quick.next!=null){
            quick = quick.next.next;
            slow = slow.next;
        }
        return slow;
    }
}