class Solution {
    public int solution(int[] array) {
        int[] idxArr = new int[1000];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < idxArr.length; j++){
                if(array[i] == j){
                    idxArr[j] += 1;
                    break;
                }
            }
        }
        int max = idxArr[0];
        for(int k : idxArr){
            if(k > max){
                max = k;
            }
        }
        int count = 0;
        int mode = 0;
        for(int l = 0; l < idxArr.length; l++)
            if(idxArr[l] == max){
                count++;
                mode = l;
            }
        return count > 1 ? -1 : mode;
    }
}