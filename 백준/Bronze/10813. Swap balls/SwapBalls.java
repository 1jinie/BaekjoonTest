import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());                                                // number of baskets
        int[] baskets = new int[n];
        int m = Integer.parseInt(st1.nextToken());                                                // how many times
        for(int i = 0; i < n; i++){                                                               // put balls in each basket
            baskets[i] = i + 1;
        }
        int temp = baskets[0];                                                                    // initialize variable 'temp'
        for(int j = 0; j < m; j++){                                                               // m times swap balls
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            temp = baskets[a - 1];
            baskets[a - 1] = baskets[b - 1];
            baskets[b - 1] = temp;
        }
        for(int k : baskets){                                                                     // show balls in baskets
            System.out.print(k + " ");
        }
    }

}
