import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();                                    // input current time(hour)
        int minute = sc.nextInt();                                  // input current time(minute)
        int time_use = sc.nextInt();                                // input time required(minute)
        minute += time_use;                                         // current time + required time
        if(minute >= 60){        
            hour += (minute / 60);
            minute %= 60;
            if(hour >= 24){
                hour %= 24;
            }
        }
        System.out.printf("%d %d", hour, minute);
    }

}
