package _328奇偶链表;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // head 为奇链表头结点，o 为奇链表尾节点
        ListNode o = head;
        // p 为偶链表头结点
        ListNode p = head.next;
        // cur 为偶链表尾节点
        ListNode cur = p;
        //o和cur才是运动中的双指针
        while (o.next != null && cur.next != null) {
            o.next = cur.next;
            o = o.next;
            cur.next = o.next;
            cur = cur.next;
        }
        //将偶数的头结点p结在奇数尾节点的后面
        o.next = p;
        return head;
    }
}
