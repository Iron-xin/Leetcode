package 剑指offer._29顺时针打印矩阵;

public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0){
            return new int[0];
        }
        int maxRow = matrix.length;
        int maxCol= matrix[0].length;        //最大行数,最大列数

        int resLen = maxRow * maxCol;           //结果数组长度
        int[] res = new int[resLen];

        int resIndex = 0;//跳到某个数字的索引

        int row = 0;
        int col=0;                        //当前行 ,当前列

        while (row <= maxRow && col <= maxCol) {
            for (int i = col; i < maxCol; i++) {        //向右
                res[resIndex] = matrix[row][i];
                resIndex++;
                if (resIndex == resLen) {           //已满，返回
                    return res;
                }
            }

            for (int i = row + 1; i < maxRow - 1; i++) {    //向下
                res[resIndex++] = matrix[i][maxCol - 1];
                if (resIndex == resLen) {
                    return res;
                }
            }
            for (int i = maxCol - 1; i > col; i--) {        //向左
                res[resIndex++] = matrix[maxRow - 1][i];
                if (resIndex == resLen) {
                    return res;
                }
            }
            for (int i = maxRow - 1; i > row; i--) {        //向上
                res[resIndex++] = matrix[i][col];
                if (resIndex == resLen) {
                    return res;
                }
            }
            row++;                                          //转完一圈了，把起点向右下移动
            col++;
            maxRow--;                                       //最大行数，列数都减1
            maxCol--;
        }
        return res;
    }
}