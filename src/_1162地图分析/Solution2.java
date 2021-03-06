package _1162地图分析;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public int maxDistance(int[][] grid) {
        // 思路：BFS
        if (grid == null || grid.length == 0 || grid[0].length == 0) return -1;
        int N = grid.length;
        int res = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] == 1) queue.add(new int[]{i,j});
            }
        }
        if (queue.isEmpty() || queue.size() == N * N) return -1;
        while (!queue.isEmpty()) {
            int layerSize = queue.size();
            // 遍历每层节点 这里注意只有第二次遍历才会真正产生距离为1的海洋
            // 因此结果要-1
            for (int i = 0; i < layerSize; ++i) {
                int[] arr = queue.poll();
                int x = arr[0], y = arr[1];
                // 遍历过的节点改为 -1 做为区分
                if (x >= 1 && grid[x-1][y] == 0) {
                    grid[x-1][y] = -1;
                    queue.add(new int[]{x-1, y});
                }
                if (x < N-1 && grid[x+1][y] == 0) {
                    grid[x+1][y] = -1;
                    queue.add(new int[]{x+1, y});
                }
                if (y >= 1 && grid[x][y-1] == 0) {
                    grid[x][y-1] = -1;
                    queue.add(new int[]{x, y-1});
                }
                if (y < N-1 && grid[x][y+1] == 0) {
                    grid[x][y+1] = -1;
                    queue.add(new int[]{x, y+1});
                }
            }
            ++res;
        }
        return res-1;
    }

}
