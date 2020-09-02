package _657机器人能否返回原点;

public class Solution {
    public boolean judgeCircle(String moves) {
        //定义水平和垂直方向的初始值
        int updown=0;
        int leftright=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')
                updown++;

            if(moves.charAt(i)=='D'){
                updown--;
            }
            if(moves.charAt(i)=='L'){
                leftright--;
            }
            if(moves.charAt(i)=='R'){
                leftright++;
            }
        }
        return leftright==0&&updown==0;
    }
}