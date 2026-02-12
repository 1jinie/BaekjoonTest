import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        for(int i = 0; i < 30; i++){
            arr[i] = i + 1;
        }
        for(int j = 0; j < 30 -2; j++) {
            int n = Integer.parseInt(br.readLine());
            arr[n - 1] = 0;
        }
        for(int k = 0; k < 30; k++){
            if(arr[k] != 0){
                System.out.println(arr[k]);
            }
        }
    }
}