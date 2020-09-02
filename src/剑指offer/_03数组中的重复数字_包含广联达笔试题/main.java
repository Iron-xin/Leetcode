package 剑指offer._03数组中的重复数字_包含广联达笔试题;

public class main {
    public int minTaps(int n, int[] ranges) {
        int[] datas = new int[n];
        for (int index = 0; index <= n; index++) {
            if (ranges[index] == 0) {
                continue;
            }
            int maxLen = index + ranges[index] - 1;//某个位置到达最远的
            int maxIndex = Math.min(maxLen, n - 1);//最远，需要看你是否越界，越界就按界限处理
            int minIndex = Math.max(0, index - ranges[index]);//最左侧，也是判断越界
            for (int i = minIndex; i <= maxIndex; i++) {
                datas[i] = Math.max(datas[i], maxLen);//用来记录最远，如果出现不同，说明进入了下一个标记
            }
        }
        int index = 0;
        int count = 1;
        while (index < n) {
            if (datas[index] == 0) {
                return -1;
            }
            if (datas[index] >= n - 1) {
                return count;
            }
            index = datas[index] + 1;
            count++;
        }
        return -1;
    }
}
