package 剑指offer._38字符串的排列;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private char[] chs;
    private List<String> res = new ArrayList<>();
    private StringBuilder path = new StringBuilder();

    public String[] permutation(String s) {
        chs = s.toCharArray();
        boolean[] visited = new boolean[chs.length];
        dfs(visited);
        return res.toArray(new String[chs.length]);
    }

    private void dfs(boolean[] visited) {
        if (path.length() == chs.length) {
            res.add(new String(path));
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chs.length; i++) {
            if (!visited[i]) {
                if (set.contains(chs[i])) {
                    continue;
                }
                path.append(chs[i]);
                visited[i] = true;
                set.add(chs[i]);
                dfs(visited);
                visited[i] = false;
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
}
