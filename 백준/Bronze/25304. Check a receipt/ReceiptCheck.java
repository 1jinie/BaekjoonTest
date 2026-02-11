import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();                            // total price
        int num = sc.nextInt();                              // number of kinds of things
        int result = 0;
        int[] arr = new int[num];                            // array of num
        for(int i = 0; i < num; i++){                        // addition of each price and number to result
            arr[i] = sc.nextInt() * sc.nextInt();
            result += arr[i];
        }
        if(result == total){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
