package _106中序和后序重建二叉树;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0)
            return null;
        return rebuildBT(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

    private TreeNode rebuildBT(int[] in, int ileft, int iright, int[] pos, int pleft, int pright){
        if(iright < ileft || pright < pleft) return null;
        TreeNode root = new TreeNode(pos[pright]);
        int idx = ileft;
        while(in[idx] != pos[pright]){
            idx++;
        }
        root.left = rebuildBT(in, ileft, idx - 1, pos ,pleft, idx + pleft - ileft - 1);
        root.right= rebuildBT(in, idx + 1, iright, pos, idx + pleft - ileft, pright - 1);
        return root;
    }
}