import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));          // BufferedReader type variable br with InputStreamReader(String type)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        // BufferedWriter type variable bw with InputStreamWriter
        StringTokenizer st = new StringTokenizer(br.readLine());                           // StringTokenizer type variable st with readLine() : read line by line
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(a + b));
        bw.flush();
        bw.close();
        br.close();
    }

}
