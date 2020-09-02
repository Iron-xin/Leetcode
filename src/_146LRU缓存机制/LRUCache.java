package _146LRU缓存机制;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;

public class LRUCache {
    Queue<Integer> queue;
    Map<Integer, Integer> map;
    int capacity;
    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }
    //如果你要get某个信息，说明最近使用到了，就很难被淘汰，因此重新入队
    //在队列中将这个元素去掉。再添入队列
    //注意只是在队列中改动顺序，而map表实际没动
    public int get(int key) {
        if (queue.contains(key))
        {
            queue.remove(key);
            queue.add(key);
            return map.get(key);
        }
        else
        {
            return -1;
        }
    }
    //如果是新加入的，也是这样，如果已经有了，就要更新一下
    //更新的不仅是这个key，因为传入的值是不同的，所以map中肯定也是要更新的。
    //第二个就是考虑，如果不包含，并且容量满了，就要将队列首部删除，然后入队
    //第三个就是容量没满，这样也不用剔除其他元素了。
    public void put(int key, int value) {
        if (queue.contains(key))
        {
            queue.remove(key);
            queue.add(key);
            map.put(key, value);
        }
        else if (capacity == 0)
        {
            map.remove(queue.poll());
            queue.add(key);
            map.put(key, value);
        }
        else
        {
            queue.add(key);
            map.put(key, value);
            capacity--;
        }
    }
}
