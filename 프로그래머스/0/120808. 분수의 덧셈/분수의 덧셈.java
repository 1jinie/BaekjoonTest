class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int n = numer1 * denom2 + numer2 * denom1;
        int d = denom1 * denom2;
        int max = 1;
        for(int i = 2; i <= n; i++){
            if((n % i == 0) && (d % i == 0)){
                max = i;
            }
        }
        n /= max;
        d /= max;
        int[] answer = {n, d};
        return answer;
    }
}