import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int length = 2;
        for(int i = 0; i < n; i++){
            length += (length - 1);
        }
        int point = (int)Math.pow(length, 2);
        System.out.println(point);
    }
}
