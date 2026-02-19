import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] black = new boolean[100][100];
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x - 1; j < x + 9; j++){
                for(int k = y - 1; k < y + 9; k++){
                    if(black[j][k] == false){
                        black[j][k] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
