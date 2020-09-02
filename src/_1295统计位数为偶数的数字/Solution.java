package _1295统计位数为偶数的数字;

public class Solution {
    public int findNumbers(int[] nums) {
        int res =0;
        for(int i=0;i<nums.length;i++){
            res += help(nums[i]);
        }
        return res;
    }
    //看这个数能除以几个10，偶数个就count+1.否则就是奇数位
    public int help(int num){
        int count =0;
        while (num!=0) {
            num = num / 10;
            count++;
        }
        if(count%2==0)
            return 1;
        return 0;
    }
}
