package _1365有多少小于当前数字的数字;

public class Solution2 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];//桶就这么大
        int[] res = new int[nums.length];//新建数组

        //统计每个数出现的次数
        for(int i=0;i<nums.length;i++){
            counts[nums[i]]++;
        }
        // 剪枝,更新为小于等于当前某数的数量
        for (int i = 1; i < counts.length; i++) {
            counts[i] = counts[i] + counts[i - 1];
        }


        //比num[i]小的数的数量，是counts对应索引减1的，对应索引的是小于等于的。
        for(int i=0;i<nums.length;i++){
            if (nums[i] > 0)
                res[i]=counts[nums[i] - 1];
            //如果某个数是0，那么显然比这个数小的数量是0。
        }
        return res;
    }
}
