package _24两两交换链表中的节点;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode root = new ListNode(-1);//虚拟头结点
        root.next = head;
        ListNode cur = root;
        //交换的是cur.next和cur.next.next；每次交换后，步长为2
        while(cur!=null && cur.next!=null && cur.next.next!=null){
            ListNode temp =  cur.next.next.next;//a->b->c->d->e 交换b和c，temp指向d，cur指向的a
            ListNode temp2 = cur.next.next;//temp2指向c
            cur.next.next.next = cur.next;//c的next指向b
            cur.next.next = temp;//b指向temp，即d
            cur.next = temp2; //cur的下一个改成temp2即c

            cur=cur.next.next;

        }

        return root.next;
    }
}



