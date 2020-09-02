package _945使数组唯一的最小增量;

public class Solution2 {

    public int minIncrementForUnique(int[] A) {
        // counter数组统计每个数字的个数。
        if (A.length <= 1){
            return 0;
        }
        int[] counter = new int[40001];
        int max = -1;
        for (int i=0;i<A.length;i++) {
            counter[A[i]]++;
            max = Math.max(max, A[i]);
        }

        // 遍历counter数组，若当前数字的个数cnt大于1个，则只留下1个，其他的cnt-1个后移
        int count = 0;
        for (int num = 0; num < max; num++) {
            if (counter[num] > 1) {
                //没位置只能留一个数，其他的数都要往下一个大一点的索引移动
                int d = counter[num] - 1;
                count += d;
                counter[num + 1] += d;
            }
        }
        // 最后, counter[max+1]里可能会有从counter[max]后移过来的，counter[max+1]里只留下1个，其它的d个后移。
        // 设 max+1 = x，那么后面的d个数就是[x+1,x+2,x+3,...,x+d],
        // 因此操作次数是[1,2,3,...,d],用求和公式求和。
        int d = counter[max] - 1;
        count += (1 + d) * d / 2;
        return count;
    }
}
