package _34在排序数组中查找元素的第一个和最后一个位置;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        //先判空
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{//否则中点mid等于目标值
                if(nums[left] == target && nums[right] == target){//中点相等并且左右边界也相等时，就跳出吧
                    break;
                }else if(nums[left] == target){//如果只是左边相等（那就左边不动）
                    right--;
                }else if(nums[right] == target){//如果只是右边相等
                    left++;
                }else{//仅仅只是中点相等，左右边界都不等，就左右都减一个位置，再二分。（这个位置的处理有难度）
                    //正是因为这里每次只动一个位置，保证了后面的不会出现[2，3，4，5，5，6] 在找5的时候，左边界跳到第二个5。
                    //但是这个处理是O(n)级别的
                    left++;
                    right--;
                }
            }
        }
        //退出的时候只有两种可能 1. 从break处跳出 此时说明上面找到了区间 同时满足left != right 且 left < right
        //2.left >= right
        //一直认为while(left < right)的退出条件只有一个 left == right，其实并不是，left < right的反面是left >= right
        //像测试用例[2,2] target= 1时推出，left = 0.right = -1.此时left > right 也满足推出的条件。
        //因此下面分为两种情况 1.left > right  2.left != right(break退出的) 3.left == right
        //1.left > right 此时直接返回[-1,-1]
        if(left > right){
            return new int[]{-1,-1};
        }
        //2.left != right
        if(left != right){
            return new int[]{left,right};
        }
        //3.left == right  这时候要判断left是否等于target 如果是返回new int[]{left,right}.否则返回new int[]{-1,-1}
        return nums[left] ==target ? new int[]{left,right} : new int[]{-1,-1};
    }
}
//显示超时，这是我写的双指针的，这个超时了。
class Solution3 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        if(nums.length == 1){
            if(nums[0] == target)
                return new int[]{0,0};
            return new int[]{-1,-1};
        }
        int left =0;
        int right =nums.length-1;
        while(left<nums.length-1){
            while(nums[left] <target)
                left++;
        }
        if(nums[left] !=target  )
            left = -1;
        while(right>0) {
            while(nums[right] >target)
                right--;
        }
        if(nums[right] !=target )
            right = -1;
        return new int[]{left,right};
    }
}
