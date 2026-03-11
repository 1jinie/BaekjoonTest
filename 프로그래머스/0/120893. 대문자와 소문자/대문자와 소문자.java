class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(int i = 0; i < my_string.length(); i++){
            if((my_string.charAt(i) >= 'A') && (my_string.charAt(i) <= 'Z')){
                arr[i] = (char)(arr[i] + 32);
                answer += arr[i];
            } else{
                arr[i] = (char)(arr[i] - 32);
                answer += arr[i];
            }
        }
        return answer;
    }
}