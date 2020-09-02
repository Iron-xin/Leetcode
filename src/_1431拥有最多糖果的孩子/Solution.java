package _1431拥有最多糖果的孩子;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for(int i=0;i<candies.length;i++){
            max = Math.max(candies[i],max);
        }
        for(int j=0;j<candies.length;j++){
            if(candies[j]+extraCandies<max)
                res.add(false);
            else
                res.add(true);
        }
        return res;

    }
}
