package _02两数相加;
//伪代码如下：
//
//        将当前结点初始化为返回列表的哑结点。
//        将进位 carrycarry 初始化为 00。
//        将 pp 和 qq 分别初始化为列表 l1l1 和 l2l2 的头部。
//        遍历列表 l1l1 和 l2l2 直至到达它们的尾端。
//        将 xx 设为结点 pp 的值。如果 pp 已经到达 l1l1 的末尾，则将其值设置为 00。
//        将 yy 设为结点 qq 的值。如果 qq 已经到达 l2l2 的末尾，则将其值设置为 00。
//        设定 sum = x + y + carrysum=x+y+carry。
//        更新进位的值，carry = sum / 10carry=sum/10。
//        创建一个数值为 (sum \bmod 10)(summod10) 的新结点，并将其设置为当前结点的下一个结点，然后将当前结点前进到下一个结点。
//        同时，将 pp 和 qq 前进到下一个结点。
//        检查 carry = 1carry=1 是否成立，如果成立，则向返回列表追加一个含有数字 11 的新结点。
//        返回哑结点的下一个结点。
//        请注意，我们使用哑结点来简化代码。如果没有哑结点，则必须编写额外的条件语句来初始化表头的值。

import java.util.ArrayList;
 // Definition for singly-linked list.
 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

//使用虚拟头结点，是为了方便记录新链表的头结点，因为新链表不断添加节点后，无法获得头结点
//因此本例中，使用数组来记录头结点。
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //首位是个位，后面的是百位、千位.....
        ListNode a = l1;
        ListNode b = l2;//两个指针
        ListNode cur = new ListNode(0);//返回的新链表
        ArrayList<ListNode> list = new ArrayList<>();
        int num = 0; //用来记录需要进位的情况。
        while(a !=null || b !=null){
            if(a == null)
                num = num +0 +b.val;
            else if(b == null)
                num = num +0 +a.val;
            else{
                num =num + a.val +b.val;
            }
            cur.next = new ListNode(num%10);
            list.add(cur.next);
            cur = cur.next;
            num = num/10;
            if (a != null) a = a.next;//必须判断是否为空，否则空指针异常
            if (b != null) b = b.next;
            if(num==1)
                cur.next = new ListNode(num);
        }
        return list.get(0);
    }
    public String toString(){
        return null;
    }
}