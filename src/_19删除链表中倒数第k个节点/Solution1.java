package _19删除链表中倒数第k个节点;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null ||head.next==null)
            return null;
        ListNode h = head;
        ListNode quick = head;
        ListNode slow = head;
        for(int i = 0;i<n;i++){
            quick = quick.next;
        }
        //如果没有使用虚拟头结点，会考虑到quick移动到了null，此时是删除倒数K个，且链表长度为k。
        //因此，对于没有虚拟头结点的情况，在删除头结点的时候，需要单独考虑，而虚拟头结点的好处就是删除头和删除普通的代码一样
        if(quick == null){
            ListNode node = slow.next;
            slow = node;
            return slow;
        }

        while(quick.next!=null){//因为只要移动到要删除的前一个节点即可
            quick = quick.next;
            slow = slow.next;
        }
        ListNode temp = slow.next;
        slow.next = temp.next;
        temp = null;
        //slow.next = slow.next.next;可以代替上面的3行代码
        return h;
    }
}