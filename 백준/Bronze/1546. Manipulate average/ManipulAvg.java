import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] subjects = new int[n];                                                            // number of subjects
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        for(int i = 0; i < subjects.length; i++){                                               // input score and calculate maximum
            int score = Integer.parseInt(st.nextToken());
            subjects[i] = score;
            if(score > max){
                max = score;
            }
        }
        float total = 0f;
        for(int k : subjects){                                                                  // calculate addition and average
            total += ((float) k /(float) max * 100);
        }
        System.out.println(total / subjects.length);
    }

}
