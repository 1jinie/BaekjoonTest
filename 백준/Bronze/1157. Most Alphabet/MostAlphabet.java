import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();                                            // String to uppercase
        int[] count = new int[26];                                                            // to count alphabet number
        for(int i = 0; i < word.length(); i++){                                               // count each alphabets by char
            count[word.charAt(i) - 'A']++;
        }
        int max = 0;
        int modeCount = 0;
        char mode = ' ';
        for (int i : count) {                                                                 // find maximum count
            if (i > max) {
                max = i;
            }
        }
        for(int i = 0; i < count.length; i++){                                                // output
            if(max == count[i]){
                modeCount++;
                mode = (char)('A' + i);
            }
        }
        System.out.println(modeCount > 1 ? "?" : mode);
    }
}

