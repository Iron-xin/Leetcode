package _老虎;

import java.util.*;


public class Main {
    /**
     * 返回最少需要多少辆车
     * @param trips int整型二维数组 二维int数组，用于表示一组乘客的行程信息，其中`trip[i]`表示第i组乘客，`trip[i][0]`表示第i组乘客的乘客数量，`trip[i][1]`表示上车站点，`trip[i][2]`表示下车站点。
     * @param capacity int整型 int类型，表示每辆车最多能承载多少名乘客
     * @return int整型
     */
    public static int minCarCount (int[][] trips, int capacity) {
        // write code here
        int count = 0;
        int ans = 1;
        int[] arr = new int [10000];//索引就是要下车的站点，数据就是记录要下车的人数
        for(int i=0;i<trips.length;i++){

            arr[trips[i][2]-1] = arr[trips[i][2]-1]+ trips[i][0];//记录下车人数
        }
//        for(int i=0;i<arr.length;i++){
//
//           System.out.println(arr[i]);
//        }
        for(int i=0;i<trips.length;i++){
            count = count +trips[i][0];
            count = count - arr[i];
            if(count>capacity){
                ans++;
                count = count - arr[i];
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int [][] arr = new int[][]{{2,1,4},{4,2,6}};
        System.out.println(  minCarCount(arr,5));

    }
}
