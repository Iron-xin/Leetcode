package _老虎;
import java.util.*;


public class Solution {
    /**
     * int，返回做完x个任务后能达到的最高等级
     * @param x int整型 需要完成的任务数量
     * @param level int整型 初始等级
     * @param tasks int整型二维数组 表示可供选择的任务，tasks[i][0]表示第i个任务所需的最低等级，task[i][1]表示第i个任务完成后能提升的等级
     * @return int整型
     */
    public int maxLevel (int x, int level, int[][] tasks) {
        // write code here
        int lenth = tasks.length;
        if(lenth==0)
            return 0;
        int res = level;
        int count =0;
        int cur = 0;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(tasks, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1==o2)
                    return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        });
        for(int[] task: tasks){
            list.add(task);
        }
        while(count <x){
            int curlen = list.size();
            for(int i= 0;i<curlen;i++ ){
                if(res<(list.get(i)[0]))
                    continue;;
                   res = res+ list.get(i)[0];
                   cur = i;
                   break;
            }
            list.remove(cur);
            count++;
        }

        return count;//应该返回level
    }
}