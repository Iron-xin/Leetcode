package _378有序矩阵第K小的元素;

public class Solution2 {
    public int kthSmallest(int[][] matrix, int k) {
        int l = matrix[0][0];
        int r = matrix[matrix.length-1][matrix.length-1];
        int mid;

        while(l < r) {
            mid = (l + r) >> 1;
            if(count(matrix, mid) >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    // 快速计算矩阵中<=num的个数，O(n)
    private int count(int[][] m, int num) {
        int i = 0;
        int j = m.length-1;//最后一行
        int cnt = 0;
        while(i < m.length && j >= 0) {
            if(m[i][j] > num) {
                j--;
            } else {
                cnt += j + 1;
                i++;
            }
        }
        return cnt;
    }
}
