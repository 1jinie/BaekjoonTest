import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int sum = 0;                                                                        // summation all
        int line = 0;                                                                       // this line
        while(sum < x){                                                                     // find a line include x
            line++;
            sum += line;
        }
        int prev = sum - line;                                                              // ordinal by previous line
        int pos = x - prev;                                                                 // present line position
        int d, n;
        if(line % 2 == 0){
            n = pos;
            d = line - pos + 1;
        } else{
            n = line - pos + 1;
            d = pos;
        }
        System.out.printf("%d/%d", n, d);
    }

}
