package _590N叉树的后序遍历;
//自己写的
import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        postorder(list,root);
        return list;
    }

    private void postorder(List<Integer> list, Node root) {
        if(root == null)
            return ;
         for(int i=0;i<root.children.size();i++){
             postorder(list,root.children.get(i));
         }
         list.add(root.val);
    }
}
