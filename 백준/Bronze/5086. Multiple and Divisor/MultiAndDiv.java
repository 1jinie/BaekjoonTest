import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 1, b = 1;
        while((a != 0) && (b != 0)){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if((a == 0) || (b == 0)){
                break;
            }
            if(b % a == 0){                                                                    // a is divisor of b
                System.out.println("factor");
            } else if(a % b == 0){                                                             // a is multiple of b
                System.out.println("multiple");
            } else{                                                                            // no relation between a and b
                System.out.println("neither");
            }
        }
    }
}

