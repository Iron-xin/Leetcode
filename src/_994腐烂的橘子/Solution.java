package _994腐烂的橘子;

import java.util.LinkedList;

public class Solution {
    class Point {//定义一个横坐标和纵坐标，用来记录当前橘子的信息。
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {
        LinkedList<Point> linkedList = new LinkedList<>();
        int rows = grid.length;//行
        int cols = grid[0].length;//列
        // 一开始，找到所有腐烂的橘子，加入队列
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                if (grid[x][y] == 2) {
                    linkedList.addLast(new Point(x, y));
                }
            }
        }

        int times = 0;//记录分钟

        while (!linkedList.isEmpty()) {
            int size = linkedList.size();
            times++;//现在是完成一轮操作，有点巧妙的，和层序遍历求深度，先拿到当前的深度是一样的思路
            while (size-- > 0) {
                Point curPoint = linkedList.removeFirst();
                int x = curPoint.x;
                int y = curPoint.y;
                if (x - 1 >= 0 && grid[x - 1][y] == 1) {
                    grid[x - 1][y] = 2;
                    linkedList.addLast(new Point(x - 1, y));
                }
                if (x + 1 < rows && grid[x + 1][y] == 1) {
                    grid[x + 1][y] = 2;
                    linkedList.addLast(new Point(x + 1, y));
                }
                if (y + 1 < cols && grid[x][y + 1] == 1) {
                    grid[x][y + 1] = 2;
                    linkedList.addLast(new Point(x, y + 1));
                }
                if (y - 1 >= 0 && grid[x][y - 1] == 1) {
                    grid[x][y - 1] = 2;
                    linkedList.addLast(new Point(x, y - 1));
                }
            }
        }

        // 校验是否全部腐烂
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                if (grid[x][y] == 1) {
                    return -1;
                }
            }
        }

        // times-1是因为最后一轮变动不会腐烂橘子，但是依旧加1，所以需要减去
        // times==0说明无需变更，所以不用减1
        return times == 0 ? 0 : times - 1;
    }
}
