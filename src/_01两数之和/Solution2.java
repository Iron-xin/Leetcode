package _01两数之和;

import java.util.HashMap;
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            map.put(nums[i],i);//这里最好使用nums[i]作为key，如果是使用i作为键，那么下面就要调整成，通过value找相应的key
        }
        for(int j =0; j<nums.length;j++){
            int temp = target - nums[j];
            if(map.containsKey(temp) && map.get(temp) != j){//get是通过key找value，这里必须用数值做key，索引做value
                int[] arr = new int[]{map.get(temp),j};
                return arr;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
//写法2
