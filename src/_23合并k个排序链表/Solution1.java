package _23合并k个排序链表;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
public class Solution1 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for (ListNode list: lists) {
            res = mergeTwoLists(res, list);
        }
//        for(int i = 0;i<lists.length;i++){
//            res =mergeTwoLists(res, lists[i]);
//        }
        return res;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode node= new ListNode(-1);//虚拟头结点
        ListNode Head=node;

        if(a==null)
            return b;
        if(b==null)
            return a;

        if(a.val > b.val) {
            node.next = b;
            node = node.next;//这一句一定要加，让node指向下一个节点
            b=b.next;
        }else{
            node.next = a;
            node = node.next;
            a = a.next;
        }
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