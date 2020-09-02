package 程序员面试金典._面试题0404特定深度节点链表;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        //创建结果的列表，最后记得抓转成数组
        List<ListNode> reslist = new ArrayList<>();
        if(tree == null)
            return reslist.toArray(new ListNode[0]);

        //借助队列实现BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);

        //非空
        while(!queue.isEmpty())
        {
            //这里使用了链表，为了写法简单，在内存中创建一个头结点
            ListNode head = new ListNode(-1);
            ListNode cur = head;

            //懂得都懂，每一层的放进来之后需要遍历一次，遍历次数就为当前queue的size()
            int num = queue.size();
            for(int i=0;i<num;i++)
            {
                //这一层的第一个结点
                TreeNode tempNode = queue.peek();
                //将其左右结点加入队列
                if(tempNode.left!=null)
                    queue.add(tempNode.left);
                if(tempNode.right!=null)
                    queue.add(tempNode.right);
                //链表的更新，把这一层的点加进去
                cur.next = new ListNode(tempNode.val);
                cur = cur.next;
                //删除遍历的这个结点
                //由于不是我写的，其实可以将poll写在最上面代替peek。
                queue.poll();
            }
            //把链表放入列表中
            reslist.add(head.next);
        }
        //列表转化为数组
        return  reslist.toArray(new ListNode[0]);

    }
}
