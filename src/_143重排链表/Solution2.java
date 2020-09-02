package _143重排链表;

public class Solution2 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        //找中点，链表分成两个
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;

        //第二个链表倒置
        newHead = reverseList(newHead);

        //链表节点依次连接
        while (newHead != null) {
            ListNode temp = newHead.next;
            newHead.next = head.next;
            head.next = newHead;
            head = newHead.next;
            newHead = temp;
        }

    }

    private ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode cur = head;//当前节点
        ListNode pre = null;//当前节点的前一个节点
        while(cur!=null){
            ListNode temp = cur.next;//临时变量记录当前节点的的下一个节点，此时完成当前节点的反转
            //因为为了避免断线，用临时变量记录下一个节点。
            cur.next = pre;//完成转头（如果不用临时变量，就会在翻转的时候断开）
            pre = cur;//更新前一个节点pre
            cur = temp;//更新当前节点。
        }
        return pre;
    }

}
