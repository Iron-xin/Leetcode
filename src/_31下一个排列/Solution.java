package _31下一个排列;

public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //从后往前比较，如果前面的数比较大，就下一个。注意这里是两两相比。如果出现前面的书比后面的数小，就说明有操作空间
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        //由于i>0，到这里就说明前面的数i比i+1的位置的数小，然后向后找一个刚刚比i大一点点的数与之交换
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {//这里从后向前找的，也可以从i向后找。
                j--;
            }
            //j-1比i小，而j比i大，所有将j和i交换。
            swap(nums, i, j);
        }
        //由于越界了，所有到这里说明所有的i位置的数都比i+1位置的大，就应该翻转了。
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}