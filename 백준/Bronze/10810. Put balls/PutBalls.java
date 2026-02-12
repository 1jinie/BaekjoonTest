import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());                                                // number of baskets
        int[] arr = new int[n];
        int m = Integer.parseInt(st1.nextToken());                                                // how many times
        for(int i = 1; i <= m; i++){                                                              // m times repeat
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());                                            // from here
            int b = Integer.parseInt(st2.nextToken());                                            // to here
            int c = Integer.parseInt(st2.nextToken());                                            // ball number to put in
            for(int j = a - 1; j <= b - 1; j++){
                arr[j] = c;
            }
        }
        for(int k : arr){                                                                         // balls in baskets
            System.out.print(k + " ");
        }
    }

}
