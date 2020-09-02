package 程序员面试金典._面试题0106字符串压缩;

public class Solution {
    public String compressString(String S) {
        if(S.length()<1)
            return S;
        char[] arr = S.toCharArray();
        int left =0;
        int right = arr.length-1;
        int count = 1;
        StringBuilder str = new StringBuilder();

        for(int i=1;i<arr.length;i++){
            if(arr[left]!=arr[i]){
                str.append(arr[left]);
                str.append(count);
                count=1;
                left = i;
            }else
                count++;
        }
        str.append(arr[left]);
        str.append(count);

        if(str.length() >= arr.length)
            return S;
        return str.toString();

    }
}
