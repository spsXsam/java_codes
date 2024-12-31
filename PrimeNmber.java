import java.util.ArrayList;
public class PrimeNmber {
    public static void main(String[] args){
        ArrayList<Integer> PrimeNumber = new ArrayList();
        for(int numberToCheck = 2;numberToCheck <= 100;numberToCheck++){
            boolean isPrime = true;
            for(int factor = 2; factor <= numberToCheck; factor++){
            if (numberToCheck % factor == 0){
               isPrime = false;
               break;
            }
            System.out.println(numberToCheck);

          }
        }
    }
}
