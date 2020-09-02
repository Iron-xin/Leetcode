package _41缺失的第一个正数;

public class Solution3 {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        if(len == 0) {
            return 1;
        }

        for(int i = 0; i < nums.length; i++) {
            //如果你是[4,3,2,1,5] 那么就要把4放到索引为3的位置，然后1就在首位，然后就让3归位，反复操作
            //因此如果是正数，并nums[i]在nums数组的长度范围内，比如上面的4变成7的时候，就不操作，[7,,3,2,1,5]变成[1,2,3,7,5]
            //第三个条件是，必须保证[1,1]这种情况出现时，不能交换，避免一直处于循环中
            while(nums[i]>=1 && nums[i]<len &&nums[nums[i]-1]!=nums[i] ) {
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(i != nums[i] - 1) {
                return i + 1;
            }
        }
        return len + 1;
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
