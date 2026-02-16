class Solution {
    public int solution(int n) {
        final int SLICE = 6;
        int gcd = gcd(n, SLICE);    
        int pizza = (n * SLICE / gcd) / SLICE;              // 최대공약수로 최소공배수 구하기
        return pizza;
    }
    
    public static int gcd(int a, int b){                    // 유클리드 호제법으로 최대공약수 구하기
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
