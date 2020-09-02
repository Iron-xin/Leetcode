package 剑指offer._40最小的k个数;

public class Solution1 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // 统计每个数字出现的次数
        int[] counter = new int[10001];
        for (int i=0;i<arr.length;i++) {
            counter[arr[i]]++;
        }
        // 根据counter数组从头找出k个数作为返回结果
        int[] res = new int[k];
        int index = 0;
        for (int num = 0; num < counter.length; num++) {
            while (counter[num]-- > 0 && index < k) {
                res[index] = num;
                index++;
            }
            if (index == k) {
                return res;
            }
        }
        return res;
    }
}

