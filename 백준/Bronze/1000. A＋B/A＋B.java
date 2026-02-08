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
        int a = Integer.parseInt(st.nextToken());                                          // Convert Token to integer type
        int b = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(a + b));                                                   // write the value of (a + b) on buffer 
        bw.flush();                                                                        // force print all letters on buffer
        bw.close();                                                                        // close stream
        br.close();
    }

}

