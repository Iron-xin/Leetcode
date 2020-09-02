package _788旋转数字;

public class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (isGoodNumber(i)) {
                count++;
            }
        }
        return count;
    }
    private boolean isGoodNumber(int value) {
        String str = String.valueOf(value);
        if (str.contains("3") || str.contains("4") || str.contains("7")) {
            return false;
        }
        if (str.contains("2") || str.contains("5") || str.contains("6") || str.contains("9")) {
            return true;
        }
        return false;
    }
}
