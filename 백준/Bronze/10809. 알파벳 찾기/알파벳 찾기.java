import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(char c = 'a'; c <= 'z'; c++){
            StringBuilder sb = new StringBuilder();
            int a = s.indexOf(c);
            System.out.print(sb.append(a).append(" "));
        }
    }
}