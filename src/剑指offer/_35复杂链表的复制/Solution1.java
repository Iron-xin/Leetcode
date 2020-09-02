package 剑指offer._35复杂链表的复制;

public class Solution1 {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        // 插入新节点（插入节点的写法），同时建立了next连接
        Node cur = head;
        while (cur != null) {
            Node clone = new Node(cur.val);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }
        // 建立 random 链接（从头开始）
        cur = head;
        while (cur != null) {
            Node clone = cur.next;
            if (cur.random != null)
                clone.random = cur.random.next;
            cur = clone.next;
        }
        // 拆分
//拆分的细节需要注意   a->a1->b->b1->c->c1
        cur = head;//当前指针指向a
        Node pCloneHead = head.next;//一个指向a1的指针
        while (cur.next != null) {//第一个whlie的功能仅仅是a->a1变成a->b。
            Node next = cur.next;//next是指向a1的指针
            cur.next = next.next;//a将会与b连接（a不再指向a1，而是b了，就这一处改动）
            cur = next;//指针指向a1，以便下次进行a1到b的拆分（完成了一次拆分）
        }
        return pCloneHead;
    }
}
