import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int[] baskets = new int[n];
        int m = Integer.parseInt(st1.nextToken());
        for(int i = 0; i < baskets.length; i++){
            baskets[i] = i + 1;
        }
        for(int j = 0; j < m; j++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int left = a - 1;
            int right = b - 1;
            while(left < right){
                int temp = baskets[left];
                baskets[left] = baskets[right];
                baskets[right] = temp;
                left++;
                right--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int k : baskets){
            sb.append(k).append(" ");
        }
        System.out.println(sb);
    }
}