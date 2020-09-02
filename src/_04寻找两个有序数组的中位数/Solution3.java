package _04寻找两个有序数组的中位数;

public class Solution3 {
//第K小的数
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) +
                getKth(nums1, 0, n - 1, nums2, 0, m - 1, right))
                * 0.5;
    }

    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;//看进来的数组长度
        int len2 = end2 - start2 + 1;//数组长度
        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
        if (len1 > len2)
            return getKth(nums2, start2, end2, nums1, start1, end1, k);
        if (len1 == 0)//此时只有一个数组
            return nums2[start2 + k - 1];
        //k是我们要找的第K小的元素，每次递归时，都会更新，因为我们重新划分了数组，相当于去掉了几个比较小的数
        if (k == 1)
            return Math.min(nums1[start1], nums2[start2]);//k=1说明我们要找的是最小的数，比较两个数组的队首元素
        //这里也是递归结束条件

        int i = start1 + Math.min(len1, k / 2) - 1;//数组1号的第i个数据（因为数组长度可能不超过k/2，所有此时是取两个的极小）
        int j = start2 + Math.min(len2, k / 2) - 1;//数组2好的第J个元素
        //将i和j比较，
        if (nums1[i] > nums2[j]) {//i大于j，则将j及前面的数都去掉，所以角标j+1。同时k更新，此时去掉了j - start2 + 1个数
            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
        }
        else {
            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }
    }
}
//两个数组比如要取中位数，那就是倒数第k=（a+b）/2小的数，我们不断减去数据，直到k=1时，这样就能直接从数组首部取元素
// 此时假设两个数组都包含k/2个数，然后比较两个数组对应k/2位置的数，如果某个数比较小，说明这个数前面一定小于第k个数。
// 所以放心删掉，然后更新K值，然后调用递归，传入新的数组索引。比如此时删了c个数，下次则从（k-c）/2为分界，从两个数组的
//第（k-c）/2开始比较，（此时新数组的开始的索引不再为0），周而复始，直到K=1，递归结束。