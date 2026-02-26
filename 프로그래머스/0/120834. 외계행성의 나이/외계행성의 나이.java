class Solution {
    public String solution(int age) {
        String ageS = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ageS.length(); i++){
            switch (ageS.charAt(i)){
                case '1': sb.append('b');
                    break;
                case '2': sb.append('c');
                    break;
                case '3': sb.append('d');
                    break;
                case '4': sb.append('e');
                    break;
                case '5': sb.append('f');
                    break;
                case '6': sb.append('g');
                    break;
                case '7': sb.append('h');
                    break;
                case '8': sb.append('i');
                    break;
                case '9': sb.append('j');
                    break;
                default: sb.append('a');
            }
        }
        return sb.toString();
    }
}