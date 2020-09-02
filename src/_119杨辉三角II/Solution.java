package _119杨辉三角II;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList();
        list.add(1);
        int n = 1;
        while(n <= rowIndex){
            list.add(0);
            for(int i = list.size() - 1; i > 0; i--){
                list.set(i,list.get(i) + list.get(i - 1));
            }
            n++;
        }
        return list;
    }
}
