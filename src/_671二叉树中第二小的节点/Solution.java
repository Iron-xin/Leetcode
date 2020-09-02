package _671二叉树中第二小的节点;

public class Solution {
    //定义一个全局变量，初始化为-1，代表默认情况下不存在第二大的值
    private int secondMinValue = -1;
    public int findSecondMinimumValue(TreeNode root)
    {
        if (root == null || root.left == null)//因为要么没有节点，要么有两个子节点
        {
            return -1;
        }
        //根据题意root.val = min(root.left.val, root.right.val)
        //最小值一定是根节点
        int firstMinValue = root.val;
        //分别查看左右子树是否存在大于根节点的第二大最小值
        SearchSecondValue(root.left, firstMinValue);
        SearchSecondValue(root.right, firstMinValue);

        return secondMinValue;
    }

    private void SearchSecondValue(TreeNode root, int firstMinValue)
    {
        if (root == null)
        {
            return;
        }
        //其实下面的代码可以合并
        if (root.val > firstMinValue)
        {
            //secondMinValue == -1代表之前还未发现比根节点大的节点
            //如果secondMinValue!= -1且root.val < secondMinValue 代表已经有比根节点大的值，但是目前的节点是更优解，所以更新
            if (secondMinValue == -1 || root.val < secondMinValue)
            {
                secondMinValue = root.val;
            }
        }
        SearchSecondValue(root.left, firstMinValue);
        SearchSecondValue(root.right, firstMinValue);
    }
}
