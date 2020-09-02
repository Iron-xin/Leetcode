package _383赎金信;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr =new int[26];

        for(int i=0;i<ransomNote.length();i++){
            arr[ransomNote.charAt(i)-'a']++;
        }

        for(int j=0;j<magazine.length();j++){
            arr[magazine.charAt(j)-'a']--;
        }

        for(int k=0;k<26;k++){
            if(arr[k]>0){
                return false;
            }
        }
        return true;
    }
    public boolean canConstruct1(String ransomNote, String magazine) {
        int[] arr =new int[26];
        char[] ch = ransomNote.toCharArray();
        char[] ch2= magazine.toCharArray();
        for(int i=0;i<ransomNote.length();i++){
            arr[ch[i]-'a']++;
        }

        for(int j=0;j<magazine.length();j++){
            arr[ch2[j]-'a']--;
        }

        for(int k=0;k<26;k++){
            if(arr[k]>0){
                return false;
            }
        }
        return true;
    }
}
