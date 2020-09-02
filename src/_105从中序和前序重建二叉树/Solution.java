package _105从中序和前序重建二叉树;

import java.util.HashMap;

public class Solution {
    int[]tempPre;
    HashMap<Integer,Integer> in_map =new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length!=inorder.length||preorder.length==0)return null;
        tempPre=preorder;
        for (int i = 0; i < inorder.length; i++) {
            in_map.put(inorder[i],i);//这里是保存的中序遍历顺序
        }
        TreeNode root=helper(0,preorder.length,0,inorder.length);//这里是左闭右开的！
        return root;
    }

    private TreeNode helper(int preStart, int preEnd, int inStart, int inEnd) {
        if (preEnd==preStart)return null;
        TreeNode node=new TreeNode(tempPre[preStart]);//获取头结点
        int rootIndex_Inorder= in_map.get(node.val);//头结点在中序遍历中的序号
        int leftNum=rootIndex_Inorder-inStart;//左子树的节点数量

        node.left=helper(preStart+1,(preStart +1)+ leftNum,
                inStart,rootIndex_Inorder);

        node.right=helper((preStart +1)+leftNum,preEnd,
                rootIndex_Inorder+1,inEnd);

        return node;
    }
}