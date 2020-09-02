package _1351统计有序矩阵中的负数;

public class Solution2 {
    public int countNegatives(int[][] grid) {
        int count = 0, col = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] < 0) {
                    count += col - j;
                    break;//剪枝
                }
            }
        }
        return count;
    }
}