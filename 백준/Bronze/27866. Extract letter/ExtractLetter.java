import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                                                            // String type variable 's'
        int i = Integer.parseInt(br.readLine());                                             // integer type variable 'i'
        System.out.println(s.substring(i - 1, i));                                           // extract from index(i - 1) to index(i)
    }

}
