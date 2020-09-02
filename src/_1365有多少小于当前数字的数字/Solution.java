package _1365有多少小于当前数字的数字;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];//桶就这么大
        int[] res = new int[nums.length];//新建数组

        //统计每个数出现的次数
        for(int i=0;i<nums.length;i++){
            counts[nums[i]]++;
        }
        //数组的某个数，对应的是桶的索引，该索引对应的数据就是当前索引出现的次数
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            //对于每个位置的数，都要统计有多少个数，因此有一个累加的过程
            //而桶数组中的i位置的数，比i位置的数小的数的数量，就是前面的累加
            for(int j=0;j<nums[i];j++){
                sum+=counts[j];
            }
            res[i]=sum;
        }
        return res;
    }
}