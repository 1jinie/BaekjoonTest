import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                                                            // Capital alphabet
        int time = 0;
        for(int i = 0; i < s.length(); i++) {                                                // for each alphabet
            String al = s.substring(i, i + 1);
            int num = 0;
            switch (al) {                                                                    // A-C : 3s, D-F : 4s ...
                case "A" : case "B" : case "C" : num = 3; 
                break;
                case "D" : case "E" : case "F" : num = 4; 
                break;
                case "G" : case "H" : case "I" : num = 5; 
                break;
                case "J" : case "K" : case "L" : num = 6; 
                break;
                case "M" : case "N" : case "O" : num = 7; 
                break;
                case "P" : case "Q" : case "R" : case "S" : num = 8; 
                break;
                case "T" : case "U" : case "V" : num = 9;
                break;
                case "W" : case "X" : case "Y" : case "Z" : num = 10;
                break;
                default : num = 2;
            };
            time += num;                                                                     // total time
        }
        System.out.println(time);
    }
}

