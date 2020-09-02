package 剑指offer._35复杂链表的复制;

import java.util.HashMap;

public class Solution2 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node p1 = head; //p1是指向旧链表的指针，将新旧节点对应
        Node p2 = head; //p2是指向新链表的指针
        HashMap<Node, Node> map = new HashMap<>();
        while (p1 != null) {
//存放的是p1节点和一个新节点，这个新节点的值和p1的值相同
            Node clone = new Node(p1.val);
            map.put(p1, clone);
            p1 = p1.next;
        }
        while (p2 != null) {
            if (p2.next != null) {
                map.get(p2).next = map.get(p2.next);
            } else {
                map.get(p2).next = null;
            }
//这里就是进行random指针的复制，这里的random和next的复制顺序可以交换，p2=p2.next必须在最后
            map.get(p2).random = map.get(p2.random);
            p2 = p2.next;
        }
        return map.get(head);
    }
}
