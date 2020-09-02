package _五八同程;

import java.util.*;


public class Solution {
    /**
     *
     * @param values string字符串ArrayList<ArrayList<>>
     * @return string字符串ArrayList
     */
    public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> ans = values.get(0);
        for(int i =0;i<values.size();i++){
            ArrayList<String> temp = values.get(i);
            ans = help(temp,ans);

        }

        return arr1;
    }

    private ArrayList<String> help(ArrayList<String> l1, ArrayList<String> l2) {
        ArrayList<String> ans = new ArrayList<>();
        return ans;
    }
}