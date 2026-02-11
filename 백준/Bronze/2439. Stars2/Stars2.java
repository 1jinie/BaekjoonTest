import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                                // total level
        for(int i = 1; i <= n; i++){                         // current level
            for(int j = 1; j <= n - i; j++){                 // print space
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){                     // print stars
                System.out.print("*");
            }
            System.out.println("");                          // to next level
        }
    }

}
