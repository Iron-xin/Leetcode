package _551学生出勤记录I;

public class Solution {
    public boolean checkRecord(String s) {
        if(s.length()<1)
            return false;
        int count =0;//记录缺席次数
        int index = 0;//记录迟到是否两次连续
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'A'){
                count++;
                if(count>=2)
                    return false;
            }
            if( i<s.length()-2&&s.charAt(i) == 'L' && s.charAt(i+1) == 'L'&& s.charAt(i+2) == 'L' )
                //注意边界条件放前面
                return false;
        }

        return true;
    }
}
