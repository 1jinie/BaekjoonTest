import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] dice = {sc.nextInt(), sc.nextInt(), sc.nextInt()};                // input dice number to array
        int prize = 0;                                                          
        int max = dice[0];
        
        for(int i = 1; i < dice.length; i++){                                   // find a max dice number
            if(dice[i] > max){
                max = dice[i];
            }
        }
        
        if((dice[0] == dice[1]) && (dice[1] == dice[2])){                       // if the three values are the same
            prize = 10000 + 1000 * max;
        } else if((dice[0] == dice[1]) || (dice[1] == dice[2])){                // if the two values are the same
            prize = 1000 + 100 * dice[1];
        } else if(dice[0] == dice[2]){
            prize = 1000 + 100 * dice[0];
        } else {                                                                // if there're no same values
            prize = 100 * max;
        }
        
        System.out.println(prize);
    }

}
