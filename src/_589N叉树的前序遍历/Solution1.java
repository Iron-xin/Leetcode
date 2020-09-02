package _589N叉树的前序遍历;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    List<Integer> list = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        if(root == null)
            return list;
        list.add(root.val);
        for(int i=0;i<root.children.size();i++){
            preorder(root.children.get(i));
        }
        return list;
    }
}
