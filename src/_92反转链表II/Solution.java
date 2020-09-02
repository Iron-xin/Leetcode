package _92反转链表II;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode node = dummyHead;//node指针是指向m-1位置的

        // 1. 遍历至m的前一个节点
        for ( int i = 1; i < m; i ++ ) {
            node = node.next;
        }

        ListNode prev = null;
        ListNode cur = node.next;//暂时指向m位置

        //比如1->2->3->4->5,m=2,n=4

        // 2. 180°旋转爆炸
        for ( int i = 0; i <= n-m; i ++ ) {
            ListNode next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
        }
       //这里实际上变成了1指向2，3也指向2，2指向空，
        //所有当前的1的下下个也就是2指向最后要接上的
        node.next.next = cur;
        //而下一个就是接上转换后的头部。
        node.next = prev;
        return dummyHead.next;
    }
}