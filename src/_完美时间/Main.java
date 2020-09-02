package _完美时间;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int knapsackCapacity = Integer.parseInt(input.nextLine().trim());

        String[] volumesStr = input.nextLine().split(" ");
        int[] volumes = new int[volumesStr.length];
        for (int i = 0; i < volumesStr.length; i++) {
            volumes[i] = Integer.parseInt(volumesStr[i].trim());
        }

        String[] valuesStr = input.nextLine().split(" ");
        int[] values = new int[valuesStr.length];
        for (int i = 0; i < valuesStr.length; i++) {
            values[i] = Integer.parseInt(valuesStr[i].trim());
        }

        if (volumes.length == values.length) {
            System.out.println(method(knapsackCapacity, volumes, values));
        }else {
            System.out.println("道具数量不一致。");
        }
        input.close();
    }

    private static int method(int knapsackCapacity, int[] volumes, int[] values) {
        int nums = volumes.length;

        int[] w = new int[nums + 1];  //重量
        int[] v = new int[nums + 1];// 价值
        for(int i = 1; i < nums + 1; i++){
            w[i] = volumes[i-1];
            v[i] = values[i-1];
        }

        int[][] dp = new int[nums + 1][knapsackCapacity + 1]; //数量是行数，容量是列数
        for(int i = 1; i < nums + 1; i++){
            //对于i，就是在前I个物品中做取舍的时候
            for(int j = 1; j <= knapsackCapacity; j++){
                if(w[i] > j){//如果某个重量大于剩余的容量时，就不能装了
                    dp[i][j] = dp[i - 1][j];
                }else{//否则，就是前I-1的最大（第i个不取），或者第i个参与时，容量要减去第I的容量，因为要表示剩余容量
                    //然后dp表示价值，因此加上价值
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                }
            }
        }
        return dp[nums][knapsackCapacity];
    }
}
