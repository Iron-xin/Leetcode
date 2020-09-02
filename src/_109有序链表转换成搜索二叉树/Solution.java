package _109有序链表转换成搜索二叉树;

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        // 快慢指针找到链表的中点，中点作为根结点，两边作为左右子树
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);
        // 快慢指针找中间结点
        ListNode fast = head, slow = head, pre = null;
        while(fast != null && fast.next != null){
            fast =  fast.next.next;
            pre = slow;
            slow = slow.next;
        }
        // 分割出左链表，用于构造本结点的左子树
        pre.next = null;
        // 分割出右链表，用于构造本结点的右子树
        ListNode rightList = slow.next;
        // 用中间结点构造根结点
        TreeNode root = new TreeNode(slow.val);
        // 构造左子树
        root.left = sortedListToBST(head);
        // 构造右子树
        root.right = sortedListToBST(rightList);
        // 返回本结点所在子树
        return root;
    }
}