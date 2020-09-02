package _200岛屿数量;

public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                //对于每一个为1的岛屿，都对其进行深度遍历，每次都会将连在一起的岛屿赋值为2
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int i, int j){
        //如果你越过了边界，或者你本身是0，或者你被标记为2，都不需要操作，直接返回
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '2'||grid[i][j] == '0')
            return;
        //否则，你就是1，是一个连起来的岛屿，我要把你赋值为2，避免后续判断的时候，又把你拿进来遍历
        grid[i][j] = '2';
        //然后对当前为1的节点，再进行深度遍历
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }
}
