import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();
        int result = 0;
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
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