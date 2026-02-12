import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());                                            // number of baskets
        int[] baskets = new int[n];
        int m = Integer.parseInt(st1.nextToken());                                            // how many times
        for(int i = 0; i < baskets.length; i++){                                              // give number to baskets
            baskets[i] = i + 1;
        }
        for(int j = 0; j < m; j++){                                                           // Reverse array
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());                                        // from
            int b = Integer.parseInt(st2.nextToken());                                        // to
            int left = a - 1;
            int right = b - 1;
            while(left < right){                                                              // if (left end ++ < right end --), swap
                int temp = baskets[left];
                baskets[left] = baskets[right];
                baskets[right] = temp;
                left++;
                right--;
            }
        }
        StringBuilder sb = new StringBuilder();                                               // String add class
        for(int k : baskets){
            sb.append(k).append(" ");
        }
        System.out.println(sb);
    }

}
