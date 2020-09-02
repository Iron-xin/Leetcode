package _824山羊拉丁文;

public class Solution1 {
    public String toGoatLatin(String S) {
        String[] strs=S.split(" ");

        String s="aeiouAEIOU";
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<strs.length;i++){
            if(s.indexOf(strs[i].charAt(0))>=0){
                builder.append(strs[i]+"ma");
            }else{
                builder.append(strs[i].substring(1,strs[i].length())+
                        strs[i].substring(0,1)+"ma");
            }
            for(int j=0;j<=i;j++){
                builder.append("a");
            }
            if(i!=strs.length-1){
                builder.append(" ");
            }
        }
        //return String.valueOf(builder);
        return builder.toString();
    }
}