class Solution {
    public int solution(int n) {
        double a = Math.sqrt(n);
        int b = (int) a;
        return a == b ? 1: 2;
    }
}