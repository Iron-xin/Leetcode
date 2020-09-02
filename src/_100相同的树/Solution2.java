package _100相同的树;

import java.util.Stack;

public class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null) return false;
        if (q == null) return false;
        Stack<TreeNode> stackP = new Stack<>();
        stackP.add(p);
        Stack<TreeNode> stackQ = new Stack<>();
        stackQ.add(q);
        while (!stackP.isEmpty() || !stackQ.isEmpty()) {
            TreeNode pNode = stackP.pop();
            TreeNode qNode = stackQ.pop();
            if (pNode == null && qNode == null) continue;
            if (pNode == null) return false;
            if (qNode == null) return false;
            if (pNode.val != qNode.val) {
                return false;
            } else {
                stackP.add(pNode.right);
                stackQ.add(qNode.right);
                stackP.add(pNode.left);
                stackQ.add(qNode.left);
            }
        }
        return true;
    }
    //第二种写法  根据自己的思路改出来的（可能需要向offer第28题那样，再添加几行，否则测试用例可能不完全能跑通）
    //这个写法就是不健壮的，必须根据28题那样添加，
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null) return false;
        if (q == null) return false;
        Stack<TreeNode> stackP = new Stack<>();
        stackP.add(p);
        Stack<TreeNode> stackQ = new Stack<>();
        stackQ.add(q);
        while (!stackP.isEmpty() || !stackQ.isEmpty()) {
            TreeNode pNode = stackP.pop();
            TreeNode qNode = stackQ.pop();
            if (pNode.val != qNode.val) {
                return false;
            } else {
                //都为空就不用管
                if(pNode.right==null && qNode.right !=null)
                    return false;
                if(pNode.left == null &&qNode.left !=null)
                    return false;
                if(pNode.left !=null &&qNode.left !=null)
                {
                    stackP.add(pNode.left);
                    stackQ.add(qNode.left);
                }
                if(pNode.right!=null &&qNode.right !=null){
                    stackP.add(pNode.right);
                    stackQ.add(qNode.right);
                }
            }
        }
        return true;
    }
}

