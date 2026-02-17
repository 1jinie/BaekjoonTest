import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < n; i++){                   
            String s = br.readLine();
            char prev = 0;
            boolean[] used = new boolean[26];
            boolean isGroupWord = true;
            for(int j = 0; j < s.length(); j++){     
                if(s.charAt(j) != prev) {
                    int idx = s.charAt(j) - 'a';
                    if(used[idx] == true){
                        isGroupWord = false;
                        break;
                    } else{
                        used[idx] = true;
                        prev = s.charAt(j);
                    }
                }
            }
            if(isGroupWord){
                count++;
            }
        }
        System.out.println(count);
    }
}