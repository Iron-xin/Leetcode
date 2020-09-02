package _141环形链表;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> s = new HashSet<>();
        //定义一个set，然后不断遍历
        while(head!=null) {
            //只要某个节点在set中出现过，说明遍历到重复元素了
            if(s.contains(head)) {
                return true;
            }
            s.add(head);
            head = head.next;
        }
        return false;
    }
}
