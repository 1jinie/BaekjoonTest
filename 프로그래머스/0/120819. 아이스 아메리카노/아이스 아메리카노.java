class Solution {
    public int[] solution(int money) {
        final int AMERICANO = 5500;
        int[] answer = new int[2];
        answer[0] = money / AMERICANO;
        answer[1] = money - answer[0] * AMERICANO;
        return answer;
    }
}