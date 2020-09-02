package _站BIBI;

public class Main2 {
    /**
     *
     * @param N int整型
     * @return int整型
     */
    public int GetCoinCount (int N) {
        // write code here
        int count =0;
        int a = 1024-N;
        count = count +a/64;
        a = a%64;

        count = count+a/16;
        a = a%16;

        count = count + a/4;
        a = a%4;

        count = count +a;

        return count;
    }
}