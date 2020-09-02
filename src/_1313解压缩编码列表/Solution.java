package _1313解压缩编码列表;

public class Solution {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {//第一次遍历求新数组长度
            length += nums[i];
        }
        int[] arr = new int[length];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {//第二次遍历往新数组中填充数据
            for(int k=0;k<nums[i];k++){
                arr[index]=nums[i+1];
                index++;
            }
        }
        return arr;
    }
}

