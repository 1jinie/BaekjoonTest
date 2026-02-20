import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());                                            // numeral system
        int dec = 0;                                                                         // to decimal
        for(int i = 0; i < n.length(); i++){                                                 // every letter
            int c = 0;
            if((n.charAt(i) >= 48) && (n.charAt(i) <= 57)){
                c = n.charAt(i) - '0';                                                       // '0' = 48
            } else {
                c = n.charAt(i) - '7';                                                       // '7' = 55
            }
            int expo = n.length() - i - 1;                                                   // exponent
            dec += (int)Math.pow(b, expo) * c;
        }
        System.out.println(dec);
    }
}

