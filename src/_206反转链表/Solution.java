package _206反转链表;

 //Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
 }


public class Solution {
    public ListNode reverseList(ListNode head) {
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