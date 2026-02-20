import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaundryChargeRefact {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int c = Integer.parseInt(br.readLine());
            int q = c / 25;                                                              // quarter
            c %= 25;
            int d = c / 10;                                                              // dime
            c %= 10;
            int n = c / 5;                                                               // nickel
            sb.append(q).append(" ");
            sb.append(d).append(" ");
            sb.append(n).append(" ");
            sb.append(c).append("\n");                                                   // penny
        }
        System.out.println(sb);
    }
}
