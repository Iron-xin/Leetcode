package _23合并k个排序链表;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution3 {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode v1, ListNode v2) {
                return v1.val - v2.val;
            }
        });

        for(int i = 0;i<lists.length;i++){
            if (lists[i] != null) {
                queue.offer(lists[i]);
            }
        }

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (!queue.isEmpty()) {
            ListNode minNode = queue.poll();
            tail.next = minNode;
            tail = minNode;
            if (minNode.next != null) {
                queue.offer(minNode.next);
            }
        }
        return dummyHead.next;
    }
}
