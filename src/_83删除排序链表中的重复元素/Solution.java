package _83删除排序链表中的重复元素;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
//上面的依赖与垃圾回收
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode cur = head;
//        while(cur != null && cur.next != null){
//            if(cur.val == cur.next.val){
//                ListNode node = cur.next;
//                cur.next = node.next;
//                node.next = null;//清除野指针
//            }else{
//                cur = cur.next;
//            }
//
//        }
//        return head;
//    }
//}
