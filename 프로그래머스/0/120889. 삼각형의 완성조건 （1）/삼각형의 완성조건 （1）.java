class Solution {
    public int solution(int[] sides) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : sides){
            if(i > max){
                max = i;
            }
            sum += i;
        }
        sum -= max;
        return sum > max ? 1 : 2;
    }
}