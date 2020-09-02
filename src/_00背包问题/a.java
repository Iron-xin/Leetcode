package _00背包问题;

public class a {
    public void ma() {
        int N = 10;
        int V = 0;
        int[][] F = new int[10][10];
        int[] weight = new int[10];
        int[] value = new int[10];
        for (int i = 1; i <= N; i++) {   //前i个
            //j是正序、降序没影响
            for (int j = 0; j <= V; j++) {  //j表示剩余容量
                for (int k = 0; k <= V / weight[i]; k++) {   //注意，K是表示已经装第i个的个数

                    if (j >= k * weight[i]) {   //如果剩余容量大于
                        //注意：状态转移方程是F[i][j]，而不是F[i - 1][j]
                        //因为这时放k个第i个物品，之后还可能继续放这个物体，所以应是F[i][j]
                        F[i][j] = Math.max(F[i - 1][j - k * weight[i]] + k * value[i], F[i][j]);
                    } else {
                        //如果不能再取了，就等于当前，为什么呢，比如之前最多取了4个，现场不满足第5个，那么就应该保留取4个的值
                        F[i][j] = F[i][j];
                    }
                }
            }
        }

    }
    //优化
/*
        //对时间复杂度的优化,集合划分：f[i-1][j],f[i][j-v[i]]+w[i]
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                f[i][j]=Math.max(f[i][j],f[i-1][j]); //要么就等于自己（因为不能再多取了），要么就等于第I个都不取
                if(j>=v[i])  //用v[i]表示体积，如果当前剩余的体积大于当前i个的体积，说明i位置的还可以装，那么我就装一个
                //或者是不装
                    f[i][j]=Math.max(f[i][j],f[i][j-v[i]]+w[i]);
            }
        }
        */

    //对空间复杂度也进行优化，此时f[j]为i-1层的f[i],而且f[j-v[i]]由于j-v[i]<j,是已经得到的第i层
//        for(int i=1;i<=n;i++){
//        for(int j=v[i];j<=m;j++){
                //让剩余体积等于I位置的体积，然后j一直变到最大体积，那么，我要么就不装，要么就装一个，因为我剩余体积是一定大于
    //i位置的，所有可以这么做
//            f[j]=Math.max(f[j],f[j-v[i]]+w[i]);
//        }
//    }


}