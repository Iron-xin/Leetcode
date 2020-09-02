package _872叶子相似的树;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
//用字符串就不用比较这么多。
public class Solution1 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        getLeaf(root1,list1);
        getLeaf(root2,list2);
        if(list1.size() != list2.size()){
            return false;
        }
        for(int i = 0 ; i < list1.size() ; i++){
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;


    }
    public List<Integer> getLeaf(TreeNode root,List<Integer> list){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null)
            return null;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if(cur.left == null && cur.right == null){
                list.add(cur.val);
            }
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
        return list;
    }
}
