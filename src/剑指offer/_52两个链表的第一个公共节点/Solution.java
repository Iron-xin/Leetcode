package 剑指offer._52两个链表的第一个公共节点;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(p1!=p2){//不相同肯定要分别移动到下一个
            p1 = p1.next;
            p2 = p2.next;
            if(p1 != p2){//如果相同，跳过。
//只有节点不同，且移动到null时，才需要换接另一个链表。但是两者都为null时，需要直接返回
//所以才必须加一个p1和p2相等的判断
                if(p1 == null)
                    p1 = headB;
                if(p2 == null)
                    p2 = headA;
            }
        }
        return p1;
    }
}
