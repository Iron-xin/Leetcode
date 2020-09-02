package _287寻找重复数;
//此题是必定有环，等价于找环节点，数组的索引是节点的顺序。不好理解
public class Solution {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];
        //[5,4,3,3,2,1] 6个数，是1到5
        slow = nums[slow];//变1
        fast = nums[nums[fast]];//变4
        while(slow!=fast){
            slow = nums[slow];//变2   变3
            fast = nums[nums[fast]];//变3 变3
        }
        fast = nums[0];//相等，此时变5
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}