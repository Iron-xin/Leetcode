package _257二叉树的所有路径;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> str = new ArrayList<>();//新建一个集合
        if(root == null)
            return str;
        Tree(root,"",str);
        return str;
    }
    //可以看到，下面的是深度遍历，先当前节点（添加值），再右节点，再左节点。
    public String Tree(TreeNode root,String s,List<String> str) {
        //这里巧妙的是。不是判断root是否为空，而是判断其子节点，不为空说明还能遍历。则把当前的root.val添加到字符串s中
        //也就是不用判断root == null
        if (root.right != null) {
            Tree(root.right, s + root.val + "->", str);
        }
        if (root.left != null) {
            Tree(root.left, s + root.val + "->", str);
        }
        //只有当root左右子树为空是，则把当前的val添加到s后，将s添加到str集合中。
        if (root.left == null && root.right == null){ str.add(s + root.val);}
        return s;
    }
//第2中写法 学这个写法
public String Tree1(TreeNode root,String s,List<String> str) {
    s = s+root.val+ "->";
    if (root.right != null) {
        Tree(root.right, s , str);
    }
    if (root.left != null) {
        Tree(root.left, s , str);
    }
    //只有当root左右子树为空是，则把当前的val添加到s后，将s添加到str集合中。
    if (root.left == null && root.right == null){ str.add(s.substring(0,s.length()-2));}
    return s;
}
}
