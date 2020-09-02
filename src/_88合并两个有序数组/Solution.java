package _88合并两个有序数组;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;//找到A数组的最后的数
        int j = n - 1;
        int index = m + n - 1;
        while (j >= 0 && i>=0) {//只要B数组没有移动完就还得移动
            if (nums2[j] >= nums1[i]) {
                nums1[index] = nums2[j];
                index--;
                j--;
            } else {//不满足b比a大，则将A元素放到对应位置，此时包含了b有可能移动完了
                nums1[index--] = nums1[i--];
            }
        }
        //b移动完，a没移动则不用处理，则还要考虑b没移动完，a移动完了。
        //如果A数组移动完了，而B数数组没移动完
        while(j >= 0){
            nums1[index] = nums2[j];
            index--;
            j--;
        }
    }
}
