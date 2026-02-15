class Solution {
    public int solution(int n) {
        int pizza = 1;
        for(int i = 0; i < (n - 1) / 7; i++){
            pizza++;
        }
        return pizza;
    }
}