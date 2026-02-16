import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isPalindrome = false;
        String s = br.readLine();
        String sr = new StringBuilder(s).reverse().toString();
        if(s.equals(sr)){
            isPalindrome = true;
        }
        System.out.println(isPalindrome ? 1 : 0);
    }
}