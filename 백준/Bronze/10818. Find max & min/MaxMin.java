import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());                                                        // input a number of integer
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){                                                            // input numbers into array
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = arr[0];                                                                               // initialize max
        int min = arr[0];                                                                               // initialize main
        for(int j = 1; j < arr.length; j++){
            if(arr[j] > max) {                                                                          // find max
                max = arr[j];
            }
            if(arr[j] < min){                                                                           // find min
                min = arr[j];
            }
        }
        System.out.println(min + " " + max);
    }

}
