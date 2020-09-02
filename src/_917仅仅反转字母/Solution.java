package _917仅仅反转字母;

public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] arr=S.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if (arr[i] < 'A' || arr[i] > 'z' || arr[i] > 'Z' && arr[i] < 'a')
                //注意，AZaz是这样的ascii码
                i++;
            else if (arr[j] < 'A' || arr[j] > 'z' || arr[j] > 'Z' && arr[j] < 'a')
                j--;
            else {
                char tmp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = tmp;
            }
        }
        // return new String(arr);
        return String.valueOf(arr);
    }
}