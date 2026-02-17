import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());                                            // number of case
        int count = 0;
        for(int i = 0; i < n; i++){                                                         // each case
            String s = br.readLine();
            char prev = 0;
            boolean[] used = new boolean[26];                                               // to check previous used letter
            boolean isGroupWord = true;                                                     // to count group word
            for(int j = 0; j < s.length(); j++){                                            // each letter
                if(s.charAt(j) != prev) {                                                   // if this letter is not same with previous letter
                    int idx = s.charAt(j) - 'a';
                    if(used[idx] == true){                                                  // if this letter was used
                        isGroupWord = false;                                                // not a group word
                        break;
                    } else{                                                                 // if this letter was not used
                        used[idx] = true;
                        prev = s.charAt(j);                                                 // this letter is inputted in previous letter
                    }
                }
            }
            if(isGroupWord){                                                                // if this is a group word, count +1
                count++;
            }
        }
        System.out.println(count);
    }

}
