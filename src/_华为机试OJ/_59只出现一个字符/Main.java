package _华为机试OJ._59只出现一个字符;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            int a =  FirstNotRepeatingChar(line);
            if(a==-1)
                System.out.println(-1);
            else
                System.out.println(line.charAt(a));
        }
        scanner.close();
    }

    public static int FirstNotRepeatingChar(String str) {
        if(str==null || str.length() == 0)
            return -1;
        int[] count = new int[123];
        //类似hash的方法来存储字符出现的次数
        for(int i=0; i < str.length();i++)
            count[str.charAt(i)]++;//进行统计
        //添加完字符后，再访问一遍数组，可以找到某个只出现一次的字符
        for(int i=0; i < str.length();i++){
            if(count[str.charAt(i)]==1)
                return i;
//这里不能遍历count数组，因为遍历count数组只能返回出现1次的字符，或者是某个字符出现的次数
//只有再拿着原字符串数组的角标遍历，才能将角标和出现次数对应上
        }
        return -1;
    }
}