import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadVertical2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        for(int row = 0; row < arr.length; row++){                                            // initialize char type 2Dmatrix to null
            for(int col = 0; col < arr[0].length; col++){
                arr[row][col] = 0;
            }
        }
        for(int row = 0; row < arr.length; row++){                                            // input letter to char type matrix
            String str = br.readLine();
            for(int col = 0; col < str.length(); col++){
                arr[row][col] = str.charAt(col);
            }
        }
        StringBuilder sb = new StringBuilder();                                               // if element is not null, add to StringBuilder
        for(int col = 0; col < arr[0].length; col++){                                         // reverse row and col
            for(int row = 0; row < arr.length; row++){
                if(arr[row][col] != 0){
                    sb.append(arr[row][col]);
                }
            }
        }
        System.out.println(sb);
    }
}
