package _03无重复字符的最长子串;

import java.util.HashMap;

public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        int left = 0;//窗口的左边界（set中是i是左边界，index右边界）这里的i是右边界
        int result = 0;
        //map中的key记录字符，value记录字符出现的位置（索引）
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                //出现相同时，修改新的边界，比较当前的左边界是不是大于相同的。
                //比如（123434561） 在更新到最后一个34561时，1重复了，而上一个1已经不在窗口中
                //因此还是取现在的左边界，认为1是有效的，不会更新窗口（而set集合中，1已经被移除窗口，不在set集合中了）
                //（1234341561）在比较34156后，进入下一个1比较时，重复元素，且上一个1在窗口中，因此直接更新窗口左边界为5
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);//有重复的也添加，更新新的索引值，所以导致相同时需要比较大小
            count = i-left+1;//i标记的时最右边，left标记的最左边
            if(result<count)
                result = count;
        }
        return result;
    }
}
