import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = arr[0][0];
        int n = 1;
        int m = 1;
        for(int i = 0; i < arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > max){
                    max = arr[i][j];
                    n = i + 1;
                    m = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(n + " " + m);
    }
}