package _1051高度检查器;

public class Solution {
    public int heightChecker(int[] heights) {
        // 共101个桶
        int[] arr = new int[101];
        // 遍历数组heights，计算每个桶中有多少个元素
        //0索引代表0出现多少次
        for (int i=0;i<heights.length;i++) {
            arr[heights[i]]++;
        }

        int count = 0;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            // arr[i]，i就是桶中存放的元素的值，arr[i]是元素的个数
            // arr[i]-- 就是每次取出一个，一直取到没有元素，成为空桶
            while (arr[i]>0) {
                // 从桶中取出元素时，元素的排列顺序就是非递减的，然后与heights中的元素比较，如果不同，计算器就加1
                if (heights[j] != i){
                    count++;

                }
                j++;
                arr[i]--;
            }
        }
        return count;
    }
}
