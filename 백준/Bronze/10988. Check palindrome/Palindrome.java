import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isPalindrome = false;
        String s = br.readLine();
        String sr = new StringBuilder(s).reverse().toString();                                // reverse String
        if(s.equals(sr)){                                                                     // compare two String
            isPalindrome = true;
        }
        System.out.println(isPalindrome ? 1 : 0);
    }

}
