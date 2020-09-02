package 剑指offer._36二叉搜索树与双向链表;

public class Solution3 {
    Node pre=null;
    Node head =null;
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        dfs(root);

        head.left = pre;
        pre.right = head;
        return head;
    }
    public void dfs(Node cur) {
        if(cur == null) return;

        dfs(cur.left);

        if(pre != null)
            pre.right = cur;
        else
            head = cur;
        cur.left = pre;
        pre = cur;

        dfs(cur.right);
    }
}

