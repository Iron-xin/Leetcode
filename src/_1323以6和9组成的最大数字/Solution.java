package _1323以6和9组成的最大数字;

public class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '6' && !flag)
            {
                result.append('9');
                flag = true;//表示已经修改一次了，以后就不让改了
            }
            else
            {
                result.append(s.charAt(i));
            }
        }
        return Integer.parseInt(result.toString());
    }
}