package _345反转字符串中的元音字母;

import java.util.ArrayList;

class Solution {
    public String reverseVowels(String s) {
        if(s.length() <= 1) return s;
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');

        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while(left < right){
            //注意这里一定要加上判断。第2 3个while中判断左右边界的
            while(left < right &&!list.contains(s.charAt(left))){
                left++;
            }
            while(left < right &&!list.contains(s.charAt(right))){
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        return new String(arr);
    }
}
//class Solution {
//    public String reverseVowels(String s) {
//        // 先将字符串转成字符数组（方便操作）
//        // 以上是只针对 Java 语言来说的 因为 chatAt(i) 每次都要检查是否越界 有性能消耗
//        char[] arr = s.toCharArray();
//        int n = arr.length;
//        int l = 0;
//        int r = n - 1;
//        while (l < r) {
//            // 从左判断如果当前元素不是元音
//            while (l < n && !isVowel(arr[l]) ) {
//                l++;
//            }
//            // 从右判断如果当前元素不是元音
//            while (r >= 0 && !isVowel(arr[r]) ) {
//                r--;
//            }
//            // 如果没有元音
//            if (l >= r) {
//                break;
//            }
//            // 交换前后的元音
//            swap(arr, l, r);
//            // 这里要分开写，不要写进数组里面去
//            l++;
//            r--;
//        }
//        // 最后返回的时候要转换成字符串输出
//        return new String(arr);
//    }
//
//    private void swap(char[] arr, int a, int b) {
//        char tmp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = tmp;
//    }
//
//    // 判断是不是元音，如果不是元音才返回 true
//    private boolean isVowel(char ch) {
//        // 这里要直接用 return 语句返回，不要返回 true 或者 false
//        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
//                ||ch=='A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
//    }
//}