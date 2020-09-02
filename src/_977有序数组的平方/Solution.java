package _977有序数组的平方;

public class Solution {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] res = new int[len];
        int left = 0, right = len - 1, resIndex = len - 1;
        while (left <= right) {
            if (A[left] * A[left] <= A[right] * A[right]) {
                res[resIndex--] = A[right] * A[right];
                right--;
            } else {
                res[resIndex--] = A[left] * A[left];
                left++;
            }
        }
        return res;
    }
}
