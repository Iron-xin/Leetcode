package _38外观数组;

public class Solution {
    public String countAndSay(int n) {
        return countAndSay("1", n);
        //先传入初始的1
    }

    private String  countAndSay(String s, int n) {
        if (n == 1) {//每次n--，共n-1次操作
            return s;
        }
        int index = 0;//索引，每次比较index和index+1的数字是否相同，当然这里也可以双指针
        int num = 1;
        StringBuilder sb = new StringBuilder();
        while (index < s.length()) {
            while ((index + 1) < s.length() && s.charAt(index) == s.charAt(index + 1)) {
                index++;//相等且不越界，就更新这两个值
                num++;
            }
            //出现不满足时，就添加num和这个值，然后重新更新num，并且索引++
            //其实可以写成两句append
            sb.append(num).append(s.charAt(index));
            num = 1;
            index++;
        }
        return countAndSay(sb.toString(), n - 1);//当前的字符用来进行下一次的操作
    }
}