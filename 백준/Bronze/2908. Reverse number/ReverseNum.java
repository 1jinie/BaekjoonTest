import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String ra = new StringBuilder(a).reverse().toString();                            // a -> reverse -> toString
        String rb = new StringBuilder(b).reverse().toString();
        int ia = Integer.parseInt(ra);
        int ib = Integer.parseInt(rb);
        System.out.println(Math.max(ia, ib));                                             // print maximum
    }

}
