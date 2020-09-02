package _1266访问所有点的最小时间;

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if (points.length == 1){
            return 0;
        }
        int res = 0;
        for (int i = 0; i < points.length-1; i++) {
            //两个点的坐标
            int length1 = points[i][0];// 第i个点的x坐标（0）
            int length2 = points[i+1][0];
            int wide1 = points[i][1];//  第i个点的Y坐标（1）
            int wide2 = points[i+1][1];
            //4种情况
            //1.两个点横坐标相等，纵坐标之差为所求
            //2.两个点纵坐标相等，横坐标之差为所求
            //3.两个点横坐标纵坐标之差相等，（正方形的对角线上），则横坐标之差等于纵坐标之差等于所求
            //4.两个节点位于长方形的对角线，此时为纵坐标和横坐标之差的较大值。（画图可以理解）
            if (length1 == length2){
                res+=Math.abs(wide1-wide2);
            }else if (wide1 == wide2){
                res+=Math.abs(length1-length2);
            }else if (Math.abs(length1-length2) == Math.abs(wide1-wide2)){
                res+=Math.abs(length1-length2);
            }else {
                res+=Math.max(Math.abs(length1-length2),Math.abs(wide1-wide2));
            }
        }
        return res;
    }
}
