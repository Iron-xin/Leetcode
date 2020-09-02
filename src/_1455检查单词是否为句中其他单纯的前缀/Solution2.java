package _1455检查单词是否为句中其他单纯的前缀;

public class Solution2 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        if (sentence == null || sentence.length() == 0 || searchWord == null || searchWord.length() == 0) {
            return -1;
        }
        int left = 0;
        int right = 0;
        int index = 0;
        int count = 0;

        while(right<sentence.length()){

            if(sentence.charAt(right)==' ' || right==sentence.length()-1){
                count++;

                if(right==sentence.length()-1){
                    for(int j =left;j<=right;j++){
                        if(sentence.charAt(j)==searchWord.charAt(index)){
                            index++;
                            if(index==searchWord.length())
                                return count;
                        }else
                            break;
                    }
                }

                for(int j =left;j<right;j++){

                    if(sentence.charAt(j)==searchWord.charAt(index)){
                        index++;
                        if(index==searchWord.length())
                            return count;
                    }else
                        break;

                }
                left = right+1;
                right++;
                index=0;
            }else
                right++;
        }
        return -1;
    }
}
