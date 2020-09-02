package _148链表排序;

public class Solution2 {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    // 归并排序
    private ListNode mergeSort(ListNode head){
        // 如果没有结点/只有一个结点，无需排序，直接返回
        if (head==null||head.next==null) return head;
        // 快慢指针找出中位点
        ListNode slowp=head,fastp=head.next.next;
        ListNode left;
        ListNode right;
        while (fastp!=null&&fastp.next!=null){
            slowp=slowp.next;
            fastp=fastp.next.next;
        }
        // 对右半部分进行归并排序
        right=mergeSort(slowp.next);
        // 链表判断结束的标志：末尾节点.next==null
        slowp.next=null;
        // 对左半部分进行归并排序
        left=mergeSort(head);
        return mergeList(left,right);
    }
    // 合并链表
    private ListNode mergeList(ListNode l,ListNode r){
        // 临时头节点
        ListNode tmpHead=new ListNode(-1);
        ListNode p=tmpHead;
        while (l!=null&&r!=null){
            if (l.val<r.val){
                p.next=l;
                l=l.next;
            }else {
                p.next=r;
                r=r.next;
            }
            p=p.next;
        }
        p.next=l==null?r:l;
        return tmpHead.next;
    }
}
