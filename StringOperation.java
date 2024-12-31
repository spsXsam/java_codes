import java.util.Scanner;
public class StringOperation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("You are playing a game. Press 'e' or 'E' to exit");
        String response = in.nextLine();
        if (response.equals("E") || response.equals("e")){
            System.out.println("You have exited the game");
        }
        else {
            System.out.println("You are still playing th game *pew pew*");
        }
    }
}
