package _202快乐数;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public boolean isHappy(int n) {
        Set<Integer> map = new HashSet<>();
        while (n != 1) {
            int temp = 0;
            while (n > 0) {
                temp += Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (map.contains(temp)) {
                return false;
            } else {
                map.add(temp);
            }
            n = temp;
        }
        return true;
    }
}