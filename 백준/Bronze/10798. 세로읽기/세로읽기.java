import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[5];
        int maxCol = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length; i++){
            str[i] = br.readLine();
            if(str[i].length() > maxCol){
                maxCol = str[i].length();
            }
        }
        for(int i = 0; i < maxCol; i++){
            for(int j = 0; j < str.length; j++){
                if(i < str[j].length()) {
                    sb.append(str[j].charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
