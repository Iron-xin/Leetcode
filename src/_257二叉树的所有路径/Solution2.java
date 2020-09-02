package _257二叉树的所有路径;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        if(root==null)
            return result;
        //传入的每一次helper，这里的StringBuffer存的是一个根节点到叶子节点的序列
        binaryTreePathsHelper(root,result,new StringBuffer());
        return result;
    }

    public static void binaryTreePathsHelper(TreeNode root, List<String> result, StringBuffer tmp){
        if(root==null) return;
        //先加入
        tmp.append(root.val);

        //终止条件是左右子节点都空(这小段代码顺序没有要求，也可以放最后面)
        if(root.left==null&&root.right==null){
            result.add(new String(tmp));

        }

        //左边节点不空，遍历左边
        if(root.left!=null){
            tmp.append("->");
            binaryTreePathsHelper(root.left,result,tmp);
            //回溯（每次都删除最后的一个标记和最后一个数）
            tmp.delete(tmp.lastIndexOf("->"),tmp.length());
        }
        //右边节点不空，遍历右边
        if(root.right!=null){
            tmp.append("->");
            binaryTreePathsHelper(root.right,result,tmp);
            //回溯
            tmp.delete(tmp.lastIndexOf("->"),tmp.length());
        }

    }
}
//下面的就是把箭头和val分开，这样就只删一个东西。
class Solution {
    private List<String> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if(root == null) {
            return;
        }
        path.add(root.val);
        if(root.left == null && root.right == null) {
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < path.size(); i++) {
                temp.append(path.get(i));
                if(i != path.size() - 1) {
                    temp.append("->");
                }
            }
            ans.add(temp.toString());
        }
        dfs(root.left);
        dfs(root.right);
        path.remove(path.size() - 1);
    }
}

