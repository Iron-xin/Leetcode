package _1436旅行终点站;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> path : paths) {
            set.add(path.get(0));   //找出所有起点放在Set里面
        }
        for (List<String> path: paths) {
            if (!set.contains(path.get(1))){   //如果set里面有不等于每次循环get到的第二个数，则该数为终点数
                return path.get(1);
            }
        }
        return "";
    }
    public String destCity1(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<paths.size();i++){
            set.add(paths.get(i).get(0));
        }
        for(int j=0;j<paths.size();j++){
            if(!set.contains(paths.get(j).get(1)))
                return paths.get(j).get(1);
        }
        return "";
    }
}