import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());                                                        // input numbers of integer
        int[] arr = new int[n];                                                                         // declare array with n
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){                                                            // inuput numbers into array by space
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());                                                        // input a number to find
        int count = 0;
        for(int j = 0; j < arr.length; j++){                                                            // find numbers with v
            if(arr[j] == v){
                count++;
            }
        }
        System.out.println(count);
    }

}
