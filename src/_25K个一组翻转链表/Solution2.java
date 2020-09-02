package _25K个一组翻转链表;

import java.util.List;
import java.util.Scanner;

public class Solution2 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0), prev = dummy, curr = head, next;
        dummy.next = head;
        int length = 0;
        while(head != null) {
            length++;
            head = head.next;
        }
        head = dummy.next;
        for(int i = 0; i < length / k; i++) {
            for(int j = 0; j < k - 1; j++) {
                next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev = curr;
            curr = prev.next;
        }
        return dummy.next;
    }
    public static void main(String[] args){

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

//        for(int i=0;i<14;i++){
//            dummy.next = new ListNode(i);
//            dummy = dummy.next;
//        }
////        System.out.println(head.next);9
//        ListNode k = reverseKGroup(head.next,3);
//        while (head!=null&&k!=null){
//            System.out.println(k);
//            k=k.next;
//        }
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int a = sc.nextInt();
            for(int i =0;i<a;i++) {
                dummy.next = new ListNode(i);
                dummy = dummy.next;
            }

            ListNode k = reverseKGroup(head.next,3);
            while (head!=null&&k!=null){
                System.out.println(k);
                k=k.next;
            }
        }


    }
}