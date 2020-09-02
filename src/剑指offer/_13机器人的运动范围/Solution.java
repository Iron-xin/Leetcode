package 剑指offer._13机器人的运动范围;

public class Solution {
    public int movingCount(int m, int n, int k) {
        if (n <= 0 || k < 0 || m <= 0)
            return 0;
        if(k==0)
            return 1;
        boolean[][] isVisited = new boolean[m][n];//标记
        int count = movingCountCore(k, m, n, 0, 0, isVisited);
        return count;
    }

    private int movingCountCore(int threshold,int rows,int cols,
                                int row,int col, boolean[][] isVisited) {
        if (row < 0 || col < 0 || row >= rows || col >= cols || isVisited[row][col]
                || cal(row) + cal(col) > threshold)
            return 0;
        isVisited[row][col] = true;
        return 1 + movingCountCore(threshold, rows, cols, row - 1, col, isVisited)
                + movingCountCore(threshold, rows, cols, row + 1, col, isVisited)
                + movingCountCore(threshold, rows, cols, row, col - 1, isVisited)
                + movingCountCore(threshold, rows, cols, row, col + 1, isVisited);
    }

    private int cal(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}