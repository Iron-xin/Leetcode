package 剑指offer._33二叉树的后序遍历序列;

public class Solution1 {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length == 0) {
            return true;
        }
        return judge(postorder, 0, postorder.length - 1);
    }

    public boolean judge(int [] postorder, int start, int end){
        if(start>=end)
            return true;//递归结束标志
        int mid = start;
        while(postorder[mid]<postorder[end]) //首先找到边界
            mid++;
        for(int i=mid;i<end;i++) {//左边确保都小于，不代表右边都小于，因此需要判断右边情况
            if(postorder[i]<postorder[end])
                return false;
        }
        return judge(postorder, start, mid-1) && judge(postorder, mid, end-1);//注意边界
    }
}