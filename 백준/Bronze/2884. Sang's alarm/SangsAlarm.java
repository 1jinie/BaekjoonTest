import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();                                    // input hour
        int minute = sc.nextInt();                                  // input minute
        minute -= 45;                                               // minute - 45
        if(minute < 0){                                             // if a minute is under 0, minus from 60 and deduct 1 hour
            minute = 60 + minute;
            hour -= 1;
            if(hour < 0){                                           // if a hour is under 0, minus from 24
                hour = 24 + hour;
            }
        }
        System.out.printf("%d %d", hour, minute);
    }

}
