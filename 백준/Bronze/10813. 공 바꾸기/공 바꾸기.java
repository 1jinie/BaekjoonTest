import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int[] baskets = new int[n];
        int m = Integer.parseInt(st1.nextToken());
        for(int i = 0; i < n; i++){
            baskets[i] = i + 1;
        }
        int temp = baskets[0];
        for(int j = 0; j < m; j++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            temp = baskets[a - 1];
            baskets[a - 1] = baskets[b - 1];
            baskets[b - 1] = temp;
        }
        for(int k : baskets){
            System.out.print(k + " ");
        }
    }
}