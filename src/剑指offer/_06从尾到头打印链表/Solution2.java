package 剑指offer._06从尾到头打印链表;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution2 {
    public int[] reversePrint(ListNode head) {
        ListNode temp = reverse(head);
        LinkedList<Integer> res = new LinkedList<>();
        while (temp != null) {
            res.add(temp.val);
            temp = temp.next;
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    private ListNode reverse(ListNode node) {
        if (node == null || node.next == null ) {
            return node;
        }
        ListNode pre = null;
        ListNode cur = node;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}