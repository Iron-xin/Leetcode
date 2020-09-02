package _1122数组的相对排序;

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] bucket = new int[1001];
        //对数组1的数字进行统计
        for (int i = 0; i < arr1.length; i++)
            bucket[arr1[i]]++;

        int idx = 0;
        //如果数组2中的某个数字出现了，那么就将这个数的个数，一个填充到数组1中，（修改了原数组）
        for (int i = 0; i < arr2.length; i++)
            while (bucket[arr2[i]] > 0) {
                bucket[arr2[i]]--;
                arr1[idx] = arr2[i];
                idx++;
            }
        //那么剩下的就是没有出现的了，从小到大进行填充
        for (int i = 0; i < bucket.length; i++)
            while (bucket[i] > 0) {
                bucket[i]--;
                arr1[idx++] = i;
            }

        return arr1;
    }
}