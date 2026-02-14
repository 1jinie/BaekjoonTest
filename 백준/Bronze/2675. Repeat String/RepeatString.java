import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());                                            // number of case
        for(int i = 0; i < t; i++){                                                         // for every case
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());                                       // number of repetition
            String s = st.nextToken();
            for(int j = 0; j < s.length(); j++){                                            // for every alphabet
                for(int k = 0; k < r; k++) {                                                // r times repeat
                    System.out.print(s.substring(j, j + 1));
                }
            }
            System.out.println();
        }
    }

}
