import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = arr[0];                                                                    // initialize max
        int idx = 1;                                                                         // initialize idx
        for(int j = 0; j < arr.length; j++){                                                 // find max & idx
            if(arr[j] > max){
                max = arr[j];
                idx = j + 1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}

