class Solution {
    public int solution(int n) {
        final int SLICE = 6;
        int gcd = gcd(n, SLICE);    
        int pizza = (n * SLICE / gcd) / SLICE;
        return pizza;
    }
    
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}