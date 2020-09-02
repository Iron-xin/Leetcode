package _557反转字符串中的单词III;

public class Solution1 {
    public String reverseWords(String s) {
        if(s==null ||s.length()==0)
            return s;
        StringBuilder str = new StringBuilder();
        char[] ch = s.toCharArray();
        int begin =0;
        int end =0;
        while(end<ch.length){
            //对于不是空格，并且没有到最后一位的时候，就跳到下一位（边界，防越界）
            if(ch[end]!=' ' && end!=ch.length-1){
                end++;
            }else{
                //不是空格，但是当前end到了最后一位，也应当进行反转。因此先添加最后一位字符
                if(end==ch.length-1)
                    str.append(ch[end]);
                //这里是通用的，如果到空格，就应该将空格前面的begin到end-1逆序填到str中
                //这也是为什么到了最后一位时，先添加最后一位字符。因为逻辑是end-1到begin
                for(int i =end-1;i>=begin;i--){
                    str.append(ch[i]);
                }
                //而如果你不是最后一位的时候，在翻转后，还要添加空格
                if(end!=ch.length-1)
                    str.append(' ');
                //完成了所有情况，则更新begin等于end
                begin=end;
            }
            //相等时的操作，指针均向后移
            if(begin==end){
                begin++;
                end++;
            }

        }
        return str.toString();
    }
}
