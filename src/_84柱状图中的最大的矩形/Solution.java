package _84柱状图中的最大的矩形;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int area = 0;
        int n = heights.length;
        // 遍历每个柱子，以当前柱子的高度作为矩形的高 h，
        // 从当前柱子向左右遍历，找到矩形的宽度 w。
        for (int i = 0; i < n; i++) {
            int w = 0;
            int h = heights[i];
            int j = i;
            //向左边找
            while (j >= 0 && heights[j] >= h) {
                w++;
                j--;
            }
            //向右边找
            j = i;
            while (j < n && heights[j] >= h) {
                w++;
                j++;
            }
            area = Math.max(area, w * h);
        }

        return area;
    }
}
