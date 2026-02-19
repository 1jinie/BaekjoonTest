import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] black = new boolean[100][100];                                                // white paper
        int n = Integer.parseInt(br.readLine());                                                  // number of black paper
        int count = 0;                                                                            // area
        for(int i = 0; i < n; i++){                                                               // each black papers
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());                                             // black paper x coordinate
            int y = Integer.parseInt(st.nextToken());                                             // black paper y coordinate
            for(int j = x - 1; j < x + 9; j++){                                                   // black paper length
                for(int k = y - 1; k < y + 9; k++){                                               // black paper height
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

