package _54螺旋矩阵;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    ArrayList arr =new ArrayList();
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new LinkedList<>();
        int startRow=0; //起始的行，上边界
        int startCow=0;  //起始列 左边界
        int row = matrix.length-1;  //二维数组行的长度  下边界
        int col = matrix[0].length-1;  //二维数组列的长度   右边界
        while(startRow <= row && startCow <= col){
            //打印一圈后，二维数组长度减2 宽度减2
            //也就是左边界+1,右边界-1，上边界+1，下边界-1
            printEdge(matrix,startRow++,startCow++,row--,col--);
        }
        return arr;
    }
    public void printEdge(int[][] matrix,int startRow,int startCow,int row,int col)
    {

        if(startRow == row){  //先判断是否只是一横行（上边界和下边界重合时只有一行）
            for(int i = startCow;i <= col;i++){
                arr.add(matrix[startRow][i]);
            }
        }
        else if(startCow == col){//判断是否只是一列（左边界和右边界重合时只有一列）
            for(int i=startRow;i<=row;i++){
                arr.add(matrix[i][startCow]);
            }
        }
        else {  //进入这里说明不止一行一列
            int curC = startCow;//用2个变量储存 记录当前位置  标记到哪一列了
            int curR = startRow; //标记到哪一行了。
            while(curC != col){    //行的遍历 （首个元素到倒数第二个元素打印）
                arr.add(matrix[startRow][curC]);
                curC++;//行坐标++  指针指向最后一个数，但并未添加到arr中。
                //指向的最后一个数，作为下一次遍历的首元素
            }
            while(curR!=row){//列的从上至下的遍历（打印首个元素到倒数第二个元素）
                arr.add(matrix[curR][col]);
                curR++; //列坐标++，此时到指向列最后一个数，而并未添加到arr中
            }
            while(curC != startCow){   //行的从右向左
                arr.add(matrix[row][curC]);
                curC--; //最后一个元素留出来
            }
            while(curR != startRow){  //列的从下向上
                arr.add(matrix[curR][startCow]);
                curR--;//最后一个元素留出来，其实这个元素在行的从左到右遍历中已经打印
            }
        }
    }
}