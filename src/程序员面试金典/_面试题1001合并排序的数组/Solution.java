package 程序员面试金典._面试题1001合并排序的数组;

public class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;//找到A数组的最后的数
        int j = n - 1;
        int index = m + n - 1;
        while (j >= 0 && i>=0) {//只要B数组没有移动完就还得移动
            if (B[j] >= A[i]) {
                A[index] = B[j];
                index--;
                j--;
            } else {//不满足b比a大，则将A元素放到对应位置，此时包含了b有可能移动完了
                A[index--] = A[i--];
            }
        }
        //b移动完，a没移动考虑了，则还要考虑b没移动，a移动的了。
        //如果A数组移动完了，而B数数组没移动完
        while(j >= 0){
            A[index] = B[j];
            index--;
            j--;
        }
    }
}
