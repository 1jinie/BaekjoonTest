import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int dec = 0;
        for(int i = 0; i < n.length(); i++){
            int c = 0;
            if((n.charAt(i) >= 48) && (n.charAt(i) <= 57)){
                c = n.charAt(i) - '0';
            } else {
                c = n.charAt(i) - '7';
            }
            int expo = n.length() - i - 1;
            dec += (int)Math.pow(b, expo) * c;
        }
        System.out.println(dec);
    }
}
