package 剑指offer._53_1在排序数组中查找数字;

public class Solution {
    public int search(int[] nums, int target) {
        int left =0,right = nums.length-1;
        int count = 0;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]>=target)
                right=mid;
            if(nums[mid]<target)
                left = mid+1;
        }
        while(left<nums.length&&nums[left]==target){
            count++;
            left++;
        }

        return count;
    }
}
//public class Solution {
//    public int search(int[] nums, int target) {
//        int left =0,right = nums.length-1;
//        int count = 0;
//        while(left<=right){
//            int mid = (left+right)/2;
//            if(nums[mid]>=target)
//                right=mid-1;
//            if(nums[mid]<target)
//                left = mid+1;
//        }
//        while(left<nums.length&&nums[left]==target){
//            count++;
//            left++;
//        }
//
//        return count;
//    }
//}

