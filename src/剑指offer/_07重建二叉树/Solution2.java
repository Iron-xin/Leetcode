package 剑指offer._07重建二叉树;

public class Solution2 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=reConstruct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        //传过去一个两个数组以及这个数组的首尾索引
        return root;
    }
    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    public TreeNode reConstruct(int[] pre,int leftP,int rightP,int[] in,int leftI,int rightI) {
        //startPre和endpre以及startIn和endIn的缩写 分别代表传入数组的首尾位置的索引
        if(leftP>rightP||leftI>rightI)  //递归结束标志（也可加入其他健壮性语句）
            return null;
//满足这两个条件，说明数组首元素索引大于尾元素索引，因此不用判断数组长度为0和数组是否为空
//个人理解：判断数组长度为0和数组为空是使代码更健壮，而非一定要写上。
        TreeNode root=new TreeNode(pre[leftP]); //找到pre的首节点，就是传过来的树的根

        for(int i=leftI;i<=rightI;i++)   //遍历传过来的中序，找到根节点。
            if(in[i]==pre[leftP]){   //其左边的是子树，调用递归。右边的是右子树，调用递归
                root.left=reConstruct(pre,leftP+1,leftP+i-leftI,in,leftI,i-1);
                root.right=reConstruct(pre,i-leftI+leftP+1,rightP,in,i+1,rightI);
                break;//找到根节点在中序的位置就可以了，可以提前退出。
            }
        return root;
    }
}