package _1422分割字符串的最大得分;


public class Solution {
    public int maxScore(String s) {
        if(s.length()<= 1)
            return 0;
        int count0 = 0;
        int[] arr0 = new int[s.length()];
        int[] arr1 = new int[s.length()];
        int count1 = 0;
        int res =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0')
                count0++;
            arr0[i] =count0;
        }
        for(int j=s.length()-1;j>0;j--){//注意这里的边界条件
            if(s.charAt(j) == '1'){
                count1++;
            }
            arr1[j] = count1;

            res = Math.max(res,(arr0[j-1]+arr1[j]));//上面的边界，由于非空，这里也是j-1和J的关系
        }
        //全相等时，要减1，因为分成非空

        return res;
    }
}

