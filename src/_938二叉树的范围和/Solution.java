package _938二叉树的范围和;
//注意，调用某个递归的时候，一定要返回。
//一定一定，而不是写出rangeSumBST(root.right,L,R);就可以了，这样没有层层返回。
public class Solution {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {

        if(root == null)
            return 0;
        if(root.val<L)
            return rangeSumBST(root.right,L,R);
        if(root.val>R)
            return rangeSumBST(root.left,L,R);
        if(root.val>=L && root.val<=R)
            //这里的sum不能写成sum = sum +.......因为这样就会导致某些元素重复计算
            sum = root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
        return sum;
    }
}
