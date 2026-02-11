import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if((x > 0) && (y > 0)){                            // First quadrant
            System.out.println(1);          
        } else if ((x < 0) && (y > 0)){                    // Second quadrant
            System.out.println(2);
        } else if ((x < 0) && (y < 0)){                    // Third quadrant
            System.out.println(3);
        } else if ((x > 0) && (y < 0)){                    // Forth quadrant
            System.out.println(4);
        }
    }

}
