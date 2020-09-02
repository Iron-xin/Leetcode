package _242有效的字母异位词;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];
        for (int i=0;i<s.length();i++) {
            sCounts[s.charAt(i) - 'a']++;
        }
        for (int i=0;i<t.length();i++) {
            tCounts[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sCounts[i] != tCounts[i]) {
                return false;
            }
        }
        return true;
    }
}