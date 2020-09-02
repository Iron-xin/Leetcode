package _70爬楼梯;
//超时解法 最暴力的
public class Solution {
    public int climbStairs(int n) {
        return climb_Stairs(0, n);
    }
    public int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }
}
//使用数组记录算过的值，避免重复运算。 也称记忆化搜索
class Solution1 {

    public int climbStairs(int n) {
        int[] arr = new int[n+1];//创建数组赋值 为了n=0时避免数组越界，因此+1
        for(int i =0;i<=n;i++){   //给数组赋初值，之后检查，判断仍为初始值，允许调用递归
            arr[i]=-1;
        }
        return fib(n,arr);
    }
    public int fib(int n,int[] arr){
        if (n < 1) {
            return 0;
        }
        if (n == 1 ){
            return n;
        }
        if(n==2){
            return 2;
        }
        if(arr[n] == -1 ){//如果等于，说明没算过，允许递归调用计算，并将结果赋值
            arr[n] =fib(n - 1,arr) + fib(n - 2,arr);
        }
        return arr[n]; //如果不等于，说明已经计算过，直接返回。避免再次调用递归计算
    }
}
//将数组变成变量，也是记录算过的值，避免重复运算，称为动态规划
class Solution3 {
    public int climbStairs(int n) {
        int first = 1;
        int second = 2;
        int result = 0;
        if(n==2) return 2;//return first;
        if(n==1) return 1;//return second;
        for(int i = 3; i <= n; i++) {
            result = second+first;     //例如f(5)=f(4)+f(3)
            first = second;            //重新赋值，代替原本f(3)位置的数
            second = result;           //重新赋值，代替原本f(4)位置的数
        }
        return result;
    }
}
