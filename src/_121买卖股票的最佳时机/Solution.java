package _121买卖股票的最佳时机;
//纯自己敲的
//如果写代码熟练的话，有些语句可以合并
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<1)
            return 0;
        int a = prices[0];//记录左边界的变量
        int profit = 0;//要求的结果
        int temp = 0;//中间变量
        for(int i =1; i<prices.length;i++){
            if(a>prices[i])//如果右边出现了较小的，就更新
                a = prices[i];
            temp = prices[i] -a;//否则不处理。然后正常减
            if(temp > profit)//如果减出来的比当前的要大，那么就更新。
                profit = temp;
        }
        return profit;
    }
}