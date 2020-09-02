package _606根据二叉树创建字符串;

public class Solution {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        doTree2str(t, sb);
        return sb.toString();
    }

    private void doTree2str(TreeNode t, StringBuilder sb) {
        if (t != null) {
            sb.append(t.val);
            if (t.left != null || t.right != null) {
                //第一次添加左括号，不知道必须是左右节点不为空才能添。如果只有右节点也是要添加的
                //而不必等到下面在右边的判断，而是直接在这里判断，很巧妙
                sb.append('(');
                doTree2str(t.left, sb);
                sb.append(')');
                //如果到了这里，必然添加过一次了，所以现在必须判断右边
                if (t.right != null) {
                    sb.append('(');
                    doTree2str(t.right, sb);
                    sb.append(')');
                }
            }
        }
    }
}
//我写的比较接近正确解的答案，关键是第二个括号出不来
//class Solution1 {
//    StringBuilder str = new StringBuilder();
//
//    public String tree2str(TreeNode t) {
//        if(t==null)
//            return null;
//        //递归开始时，添加根和根后面的左括号。
//        str.append(t.val);
//        if(t.left!=null){
//            str.append("(");
//        }
//
//        tree2str(t.left);
//        if(t.right == null)
//            str.append(")");
//        // //在进入右边子树的调用时，添加对应的左括号
//        //  if(t.right!=null)
//        //      str.append("(");
//        tree2str(t.right);
//
//        return str.toString();
//    }
//}