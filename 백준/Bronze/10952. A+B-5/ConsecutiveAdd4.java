import java.util.Scanner;

public class ConsecutiveAdd4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){                                        // infinite loop
            int a = sc.nextInt();
            int b = sc.nextInt();
            if((a == 0) && (b == 0)){                       // if a equals to 0 and b equals to 0, break loop
                break;
            }
            System.out.println(a + b);
        }
    }
}
