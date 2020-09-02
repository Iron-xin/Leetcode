package 剑指offer._58_1翻转单词顺序;

public class Solution2 {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return s;
        String str = s.trim();
        // 将字符串间多余的空白字符去除
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            char c = str.charAt(left);

            if (c != ' ')
                sb.append(c);
                //如果你是空格，我最多只能留一个，所以我要看看sb最后一个是不是空格，如果不是，说明你是第一个空格，可以要
            else if (sb.charAt(sb.length() - 1) != ' ')
                sb.append(c);

            left++;
        }

        char[] arr = sb.toString().toCharArray();//转换成字符数组

        reverse(arr, 0, arr.length - 1);//先全部翻转一次

        int start = 0;//指向单词第一个字母
        int end = 0;//指向单词最后一个字母
        while (start < arr.length) {
            while (start < arr.length && arr[start] == ' ') {
                //如果start指向的是空格，就换下一个，因为指针要指向的是单词。
                start++;
                end++;
            }
            if (end == arr.length || arr[end] == ' ') {
                //要么尾部是空格，要么end刚刚超过数组最后一个角标，这两种情况就应该翻转了
                //end之所以会超过最后角标，是因为当最后一个字符不是空格时，会让end++，所以会越界
                reverse(arr, start, end-1);
                //翻转后，应该重新记录下个单词，因此更新end和start。
                end++;
                start = end;
            } else {
                //到这里就说明，start指的不是空格，end也指的不是空格，说明是正常单词，end++即可
                end++;
            }
        }
        return String.valueOf(arr);
    }
    private void reverse(char[] arr, int begin, int end){
        while(begin<end){
            char temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;
        }
    }
}