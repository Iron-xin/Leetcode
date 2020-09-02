package _1103分糖果II;

public class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] nums = new int[num_people];
        int j=1;
        while (candies>0) {
            for (int i = 0; i < nums.length; i++) {
                if (candies>j) {
                    nums[i]+=j;
                }else {
                    nums[i]+=candies;//这里也可以提前return
                }
                candies = candies-j;
                if(candies<0)
                    return nums;
                j++;
            }
        }
        return nums;
    }
}
