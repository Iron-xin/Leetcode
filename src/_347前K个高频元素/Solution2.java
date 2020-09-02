package _347前K个高频元素;

import java.util.*;

public class Solution2 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int num : nums){
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        // 遍历map，用最小堆保存频率最大的k个元素（堆顶是这些频率最大的数中，频率最小的数）
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();//堆顶移除
                pq.add(key);
            }
        }
        // 取出最小堆中的元素
        int[] res = new int[pq.size()];
        for(int i=pq.size()-1;i>=0;i--) {
            res[i]=pq.remove();
        }
        return res;
    }
}
