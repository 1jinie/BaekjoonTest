import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        StringBuilder number = new StringBuilder();
		
		for(int i = 0; i < my_string.length(); i++){
		    char c = my_string.charAt(i);
		    
		    if(c >= '0' && c <= '9'){
		        number.append(c);
		    }
		}
		
        int[] answer = new int[number.length()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = number.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
    }
}