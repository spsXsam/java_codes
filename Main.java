import java.util.Scanner;
import java.util.Random;
public class Main{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int rn = rand.nextInt(101);
    int chances = 10;
    while(chances > 0){
        System.out.println("Enter you guess ( 1 - 100 )");
        int pg = in.nextInt();

        if (pg == rn){
            System.out.println("Correct Guess :)");
            break;
        }
        else if ( pg < rn){
            System.out.println("Guess higher");
            chances -- ;
            System.out.println("You have " + chances +  " guesses left");
        }
        else {
            System.out.println("Guess lower");
            chances -- ;
            System.out.println("You have " + chances +  " guesses left");
        }
        if (chances == 0){
            System.out.println("Game Oover\n The Random number was " + rn);
        }
    }
     }
}