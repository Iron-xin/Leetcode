package _19删除链表中倒数第k个节点;
//虚拟头结点的写法。可以看到，和写法1的差别，少了头结点处理的代码。
public class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null ||head.next==null)
            return null;
        ListNode h = new ListNode(-1);
        h.next = head;
        ListNode quick = h;
        ListNode slow = h;
        for(int i = 0;i<n;i++){
            quick = quick.next;
        }

        while(quick.next!=null){//因为只要移动到要删除的前一个节点即可
            quick = quick.next;
            slow = slow.next;
        }
        ListNode temp = slow.next;
        slow.next = temp.next;
        temp = null;
        //slow.next = slow.next.next; 这一句代替上面的3句
        return h.next;
    }
}
