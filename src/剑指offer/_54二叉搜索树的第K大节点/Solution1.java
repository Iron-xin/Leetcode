package 剑指offer._54二叉搜索树的第K大节点;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public int kthLargest(TreeNode root, int k) {
        int res = 0;
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return 0;
        inorder(root,list);
        res = list.get(list.size()-k);
        return res;
    }
    public void inorder(TreeNode root,List list){
        if(root == null)
            return;
        if(root.left !=null)
            inorder(root.left,list);
        list.add(root.val);
        if(root.right != null)
            inorder(root.right,list);
    }
}