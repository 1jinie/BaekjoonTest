import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] check = new boolean[42];                                                            // numbers of remainders (0 ~ 41)
        int count = 0;
        for(int i = 0; i < 10; i++){                                                                  // 10 numbers
            int input = Integer.parseInt(br.readLine());
            int remain = input % 42;
            if(!check[remain]){                                                                       // remainder count
                check[remain] = true;
                count++;
            }
        }
        System.out.println(count);
    }
}
