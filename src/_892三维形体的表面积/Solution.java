package _892三维形体的表面积;

public class Solution {
    public int surfaceArea(int[][] grid) {
        int N = grid.length;
        int cubes = 0; // 记录立方体的数量
        int faces = 0; // 记录立方体接触面的数量
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cubes += grid[i][j];
                if (grid[i][j] > 0) {
                    // 叠起来的 v 个立方体有 v-1 个接触面
                    faces += grid[i][j] - 1;
                }
                if (i > 0) {
                    // 当前柱子与上边柱子的接触面数量
                    faces += Math.min(grid[i-1][j], grid[i][j]);
                }
                if (j > 0) {
                    // 当前柱子与左边柱子的接触面数量
                    faces += Math.min(grid[i][j-1], grid[i][j]);
                }
            }
        }
        return 6 * cubes - 2 * faces;
    }
}
