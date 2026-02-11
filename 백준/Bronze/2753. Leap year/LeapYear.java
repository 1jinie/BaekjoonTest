import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){                // When the year is (a multiple of 4 and not a multiple of 100) or a multiple of 400
            System.out.println("1");                                                    // Leap year
        } else {
            System.out.println("0");                                                    // Normal year
        }
    }

}
