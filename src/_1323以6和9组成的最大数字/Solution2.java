package _1323以6和9组成的最大数字;
//这是牛客打竞赛的题!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Solution2 {
    /**
     *
     * @param s string字符串
     * @return string字符串
     */
    public String change (String s) {
        // write code here
        StringBuffer Str = new StringBuffer();
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='a')
                count++;
            else
                Str.append(s.charAt(i));

        }
        for(int j=0;j<count;j++){
            Str.append('a');
        }
        return Str.toString();
    }
}

