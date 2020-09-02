package 剑指offer._36二叉搜索树与双向链表;

import java.util.ArrayList;

public class Solution1 {
    public Node treeToDoublyList(Node root) {
        if (root == null)
            return null;
        ArrayList<Node> list = new ArrayList<>();
        Convert(list, root);//遍历
        return Convert(list);//遍历结束后调用连成链表的方法
    }

    public void Convert(ArrayList<Node> list, Node root) {
        if (root != null) {
            Convert(list, root.left);
            list.add(root);//在左边遍历结束后，即将进入右边的调用时，将当前节点记录
//对中序遍历进行操作一般都在中间
            Convert(list, root.right);
        }
    }

    public Node Convert(ArrayList<Node> list) {
        Node head = list.get(0);
        Node cur = head;
        for (int i = 1; i < list.size(); ++i) {//list集合没有length方法
            Node node = list.get(i);
            node.left = cur;
            cur.right = node;
            cur = node;
        }
        cur.right = head;
        head.left = cur;
        return head;
    }
}
