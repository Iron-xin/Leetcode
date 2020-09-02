package 剑指offer._68_2二叉树的最近公共祖先;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //根节点到p节点的路径
        List<TreeNode> path1 = new ArrayList<>();
        //根节点到q节点的路径
        List<TreeNode> path2 = new ArrayList<>();
        getPath(root,p,path1);
        getPath(root,q,path2);

        TreeNode result=null;
        int n = Math.min(path1.size(),path2.size());//拿出较小的路径比较
        //保留最后一个相等的节点即为公共节点
        for(int i=0;i<n;i++){
            if(path1.get(i)==path2.get(i))
                result = path1.get(i);
        }
        return result;
    }
    //前序遍历搜索节点p或q   node为跟需要寻找的节点
    public void getPath(TreeNode root,TreeNode node,List<TreeNode> path){
        if(root==null)
            return ;
        path.add(root);
        if(root == node)
            return ;
        if(path.get(path.size()-1)!=node){//看路径中的最后一个是否相等，因为我们是先添加的根节点
            getPath(root.left,node,path);
        }
        if(path.get(path.size()-1)!=node){
            getPath(root.right,node,path);
        }
        if(path.get(path.size()-1)!=node){//回溯
            path.remove(path.size()-1);
        }
    }
}