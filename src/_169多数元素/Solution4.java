package _169多数元素;

import java.util.Random;

public class Solution4 {
    public int majorityElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        int index = Partition(nums, start, end);
        int middle = nums.length / 2;
        while(index != middle) {
            if(index > middle) {
                end = index - 1;
                index = Partition(nums, start, end);
            }
            else {
                start = index + 1;
                index = Partition(nums, start, end);
            }

        }
        int times = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == nums[index])
                times++;
        }
        if(times > nums.length / 2)
            return nums[index];
        else
            return 0;
    }
    public int Partition(int[] array, int start, int end) {
        Random rand = new Random();
        int index = rand.nextInt(end - start + 1) + start;
        //这里使用随机数是优化，若选取的不合理，会导致时间复杂度增加
        Swap(array, index, end);
        int small = start - 1;
        for(index = start; index < end; index++) {
            if(array[index] < array[end]) {
                small++;
                if(small != index)
                    Swap(array, small, index);
            }
        }
        small++;
        Swap(array, small, end);
        return small;
    }
    public void Swap(int[] array, int a, int b) {
        int tmp;
        tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}