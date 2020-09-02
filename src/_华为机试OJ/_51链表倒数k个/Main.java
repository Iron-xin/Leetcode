package _华为机试OJ._51链表倒数k个;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            ListNode node = new ListNode(-1);
            node.next = null;
            int N = in.nextInt();

            for (int i = 0; i < N; i++) {
                int x = in.nextInt();
                ListNode p = new ListNode(x);
                p.next = node.next;
                node.next = p;
            }
            int k = in.nextInt();
            ListNode kthNode = getKthNode(node,k);
            System.out.println(kthNode.data);
        }
    }

    public static ListNode getKthNode(ListNode node,int k){
        ListNode front = node,behind = node;
        int x=0;
        while(front.next!=null && x<k){
            x++;
            front = front.next;
        }
        return front;
    }
}

class ListNode {
    public int data;
    public ListNode next;
    ListNode(int data){
        this.data = data;
    }
}