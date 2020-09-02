package _1290二进制链表转换成整数;

public class Solution {
    public int getDecimalValue(ListNode head) {
        if (head == null)
            return 0;
        int ans = 0;
        while (head != null) {
            ans = (ans << 1) + head.val;
            head = head.next;
        }
        return ans;
    }
}
