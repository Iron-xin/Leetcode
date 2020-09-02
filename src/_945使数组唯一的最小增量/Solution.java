package _945使数组唯一的最小增量;

import java.util.Arrays;

public class Solution {
    public int minIncrementForUnique(int[] A) {
        // 先排序
        Arrays.sort(A);
        int count = 0;
        // 遍历数组，若当前元素小于等于它的前一个元素，则将其变为前一个数+1
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                count = count+ A[i-1] - A[i] +1;
                A[i] = A[i - 1] + 1;

            }
        }
        return count;
    }
}
