import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] piece = {1, 1, 2, 2, 2, 8};
        int[] now = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < piece.length; i++){
            now[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < piece.length; j++){
            sb.append(piece[j] - now[j]).append(" ");
        }
        System.out.print(sb);
    }
}