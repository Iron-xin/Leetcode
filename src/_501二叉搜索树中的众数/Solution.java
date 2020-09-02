package _501二叉搜索树中的众数;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<Integer> modes = new LinkedList<>();
    int cur;//记录当前比较的众数的值
    int curTimes=0;//当前众数出现的次数
    int lastTimes=1;//之前记录的众数出现多大的次数
    // （默认出现了一次，其实应该默认0次，然后根节点不为空的时候，再加1）
    public int[] findMode(TreeNode root) {

        inOrder(root);
        int[] res = new int[modes.size()];//将集合转为数组
        for(int i = 0; i < modes.size(); i++)
            res[i] = modes.get(i);
        return res;
    }
    private void inOrder(TreeNode root) {
        if(root == null)
            return;
        inOrder(root.left);

        if(root.val != cur)
            //如果当前的节点val和之前记录的众数不同，说明要重新记录当前这个节点的数，看出现多少次
            //因为是中序遍历，一旦出现不同，就说明之前的都不同了。
            curTimes = 0;

        cur = root.val;//相等时，更新当前众数出现的次数
        curTimes++;

        if(curTimes == lastTimes)//如果出现次数和之前记录的最大次数一样，就说明有多个数出现了相同的次数，添加到集合中
            modes.add(cur);
        if(curTimes > lastTimes)//如果出现次数超过了之前记录的，就应该更新集合记录的值，，且更新出现次数
        {
            lastTimes = curTimes;
            modes.clear();
            modes.add(cur);
        }

        inOrder(root.right);
    }
}