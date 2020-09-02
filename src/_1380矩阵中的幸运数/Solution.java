package _1380矩阵中的幸运数;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            row[i] = matrix[i][0];
            for (int j = 0; j < matrix[0].length; j++) {
                row[i] = Math.min(row[i], matrix[i][j]);
                col[j] = Math.max(col[j], matrix[i][j]);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == col[j]) {
                    res.add(row[i]);
                    break;//在某个J即列中找到后，这个列之后就不会出现了。可以提前剪枝
                }
            }
        }
        return res;
    }
}
