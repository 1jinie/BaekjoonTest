import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                                                            // input String type word
        for(char c = 'a'; c <= 'z'; c++){                                                    // from a to z
            StringBuilder sb = new StringBuilder();
            int a = s.indexOf(c);                                                            // give index of alphabets
            System.out.print(sb.append(a).append(" "));
        }
    }

}
