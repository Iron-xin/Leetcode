package _234回文链表;

import java.util.ArrayList;

public class Solution2 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = head;
        // 1、拷贝到数组
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        int lo = 0;               // 头指针
        int hi = list.size() - 1; // 尾指针
        // 2、双指针检查
        while (lo <= hi) {
            if (!list.get(lo).equals(list.get(hi))) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
}
