package _695岛屿的最大面积;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    //对当前的这个节点进行深度遍历，然后再和最大值比较，进行更新
                    max = Math.max(maxLandDfs(grid, i, j), max);
                }
            }
        }
        return max;
    }

    private int maxLandDfs(int[][] grid, int i, int j) {
        int x = grid.length;
        int y = grid[0].length;
        if (i < 0 || j < 0 || i >= x || j >= y || grid[i][j] == 0) {
            return 0;
        }
        //遍历过你，你就设置为0，避免下次又找到你了。
        grid[i][j] = 0;
        return maxLandDfs(grid, i + 1, j) +
                maxLandDfs(grid, i - 1, j) +
                maxLandDfs(grid, i, j + 1) +
                maxLandDfs(grid, i, j - 1) +
                1;
    }
}
