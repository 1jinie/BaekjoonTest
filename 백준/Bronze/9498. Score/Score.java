import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 90){
            System.out.println("A");                    // print "A" if a score is greater than or equal to 90
        } else if(a >= 80){
            System.out.println("B");                    // print "B" if a score is under 90 & greater than or equal to 80
        } else if(a >= 70){
            System.out.println("C");                    // print "C" if a score is under 80 & greater than or equal to 70
        } else if(a >= 60){
            System.out.println("D");                    // print "D" if a score is under 70 & greater than or equal to 60
        } else {
            System.out.println("F");                    // print "F" if a score is under 60
        }
    }

}
