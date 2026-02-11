import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int[] a = new int[n];
        int x = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(st2.nextToken());
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] < x) {
                System.out.print(a[j] + " ");
            }
        }
    }
}
