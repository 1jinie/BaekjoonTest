import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                                                    // input number
        for(int i = 1; i <= 9; i++){                                             // n's times table
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }

}
