package _1189气球的最大数量;

public class Solution {
    public int maxNumberOfBalloons(String text) {
        if (text.length() == 0) {
            return 0;
        }
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        char[] chars = text.toCharArray();
        for (int i=0;i<chars.length;i++) {
            if (chars[i] == 'b') {
                b ++;
            } else if (chars[i] == 'a') {
                a ++;
            } else if (chars[i] == 'l') {
                l ++;
            } else if (chars[i] == 'o') {
                o ++;
            } else if (chars[i] == 'n') {
                n ++;
            }
        }
        return Math.min(Math.min(Math.min(b,a),Math.min(l/2,o/2)),n);
    }
    //写法2  利用数组存 其实思想是一样的
    public int maxNumberOfBalloons2(String text) {
        int ans = 10000;String began = "balloon";
        int [] arr = new int [26];
        char [] textCharArr = text.toCharArray();
        for (int i = 0; i < textCharArr.length; i++){
            arr[textCharArr[i]-'a']++;
        }
        arr['l' - 'a'] = arr['l' - 'a']/2;//因为气球单词中l为两个，因此除2减半
        arr['o' - 'a'] = arr['o' - 'a']/2; //因为气球单词中o为两个，因此除2减半
        int [] arrNew = new int [7];
        for (int i = 0; i < arrNew.length; i++){
            arrNew[i] = arr[began.charAt(i) - 'a'];
        }

        for (int i = 0; i < arrNew.length; i++){
            ans = Math.min(ans,arrNew[i]);
        }
        return ans;
    }

}