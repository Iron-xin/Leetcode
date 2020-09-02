package _02两数相加;

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //首位是个位，后面的是百位、千位.....
        ListNode a = l1;
        ListNode b = l2;//两个指针
        ListNode dummyHead = new ListNode(0);//虚拟的头结点
        ListNode cur = dummyHead;//这是遍历用的指针
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
            cur = cur.next;
            num = num/10;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }
        //最后的一位
        if(num==1)
            cur.next = new ListNode(num);
        return dummyHead.next;
    }
}
