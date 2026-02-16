import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        for(String i : s2){
            set.add(i);
        }
        for(String i : s1){
            if(set.contains(i)){
                answer++;
            }
        }
        return answer;
    }
}