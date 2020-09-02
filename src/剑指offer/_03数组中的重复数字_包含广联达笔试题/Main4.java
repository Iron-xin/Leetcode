package 剑指offer._03数组中的重复数字_包含广联达笔试题;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();//数量
            int b = sc.nextInt();//范围
            int [] arr = new int[100000];
            for(int i=0;i<a;i++){
                int c = sc.nextInt();
                arr[c] = sc.nextInt();

            }

            System.out.println(help(b,arr));
        }
    }

    public static int help(int b,int [] arr){
        int[] datas = new int[10000];
        for (int index = 0; index <= datas.length; index++) {
            if (arr[index] == 0) {
                continue;
            }
            int maxLen = index + b - 1;//某个位置到达最远的
            int maxIndex = Math.min(maxLen, datas.length - 1);//最远，需要看你是否越界，越界就按界限处理
            int minIndex = Math.max(0, index - b);//最左侧，也是判断越界
            for (int i = minIndex; i <= maxIndex; i++) {
                datas[i] = Math.max(datas[i], maxLen);//用来记录最远，如果出现不同，说明进入了下一个标记
            }
        }
        int index = 0;
        int res=0;
        while (index < datas.length) {

            if (datas[index] >= datas.length - 1) {
                return res;
            }
            index = datas[index] + 1;
            res=res+datas[index];
        }
        return res;
    }
}
