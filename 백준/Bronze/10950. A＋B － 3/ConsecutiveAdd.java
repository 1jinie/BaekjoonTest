import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();                                    // input a number of case
        int[] arr = new int[t];                                  // declare an array of a case
        for(int i = 0; i < t; i++){
            arr[i] = sc.nextInt() + sc.nextInt();                // input the result of addition into the array
            System.out.println(arr[i]);
        }
    }

}
