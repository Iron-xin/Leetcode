package _1299将每个元素替换成右侧最大元素;

public class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max,temp);

        }
        return arr;
    }
}