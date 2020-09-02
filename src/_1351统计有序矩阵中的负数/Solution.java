package _1351统计有序矩阵中的负数;

public class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;//行
        int n=grid[0].length;//列
        int num=0;//计数
        int right=n;
        int left=0;

        for(int i=0;i<m;i++){//m行 每行都算
            left=0;//每次算完后，只有左边界重新归零，右边界用上次算完的边界。区间左闭右开
            //实际上，right指向的是某行中第一个小于0的数
            while(left<right){  //只要没碰面，就二分
                int middle=(left+right)/2;
                if(grid[i][middle]>=0){
                    left=middle+1;
                }else{
                    right=middle;
                }
            }
            num+=(n-left);//此时left和right都指向的是第一个小于0的数的位置
        }
        return num;
    }
}
//下面的写法left和right不是第一个小于0的数的位置。left是，而right不是
//public class Solution {
//    public int countNegatives(int[][] grid) {
//        int m=grid.length;//行
//        int n=grid[0].length;//列
//        int num=0;//计数
//        int right=n-1;//最后一列列数
//        int left=0;
//
//        for(int i=0;i<m;i++){
//            left=0;
//            while(left<=right){  //只有没碰面，就二分
//                int middle=(left+right)/2;
//                if(grid[i][middle]>=0){
//                    left=middle+1;
//                }else{
//                    right=middle-1;
//                }
//            }
//            num+=(n-left);
//        }
//        return num;
//    }
//}
