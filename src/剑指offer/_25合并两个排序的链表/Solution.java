package 剑指offer._25合并两个排序的链表;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode node= new ListNode(-1);//虚拟头结点
        ListNode Head=node;

        if(a==null)
            return b;
        if(b==null)
            return a;

        while(a != null && b != null){
            if(a.val < b.val){
                node.next = a;
                node = node.next;
                a = a.next;
            }else{//a.val>=b.val
                node.next = b;
                node = node.next;
                b = b.next;
            }
        }
        if(a == null)
            node.next = b;
        else
            node.next = a;
        return  Head.next;
    }
}