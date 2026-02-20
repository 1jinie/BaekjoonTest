import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());                                            // number of test case
        for(int i = 0; i < t; i++){                                                         // repeat test case
            int c = Integer.parseInt(br.readLine());
            int q = 0, d = 0, n = 0, p = 0;                                                 // quarter(25), dime(10), nickel(5), penny(1)
            while(c != 0){
                while(c >= 25){                                                             // quarter
                    q++;
                    c -= 25;
                }
                sb.append(q).append(" ");
                while(c >= 10){                                                             // dime
                    d++;
                    c -= 10;
                }
                sb.append(d).append(" ");
                while(c >= 5){                                                              // nickel
                    n++;
                    c -= 5;
                }
                sb.append(n).append(" ");
                while(c >= 1){                                                              // penny
                    p++;
                    c -= 1;
                }
                sb.append(p).append("\n");
            }
        }
        System.out.println(sb);
    }

}
