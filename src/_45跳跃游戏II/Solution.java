package _45跳跃游戏II;

public class Solution {
    public static int jump(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        int steps = 0;//这是调到i位置最小要几步
        for(int i = 0; i < nums.length - 1; i++){
            //对于每一个i位置，都有其能跳到的最远距离
            maxPosition = Math.max(maxPosition, nums[i] + i);

            //如果我位于i位置，就到达了之前得到的最远距离，说明我这是跳了一步，因此我调到后，需要更新新的边界
            //2,3,1,1,4这个数组，在2的地方，end更新为2，step为1，
            //设计的i是到不了真正的边界的，注意看了
            if( i == end){ //遇到边界，就更新边界，并且步数加一
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
    public static void main(String[] args){
        int[] arr = new int[]{2,3,1,1,4};
        System.out.println(jump(arr));
        int[] arr1 = new int[]{2,3,1,1};
        System.out.println(jump(arr1));

        }

}
