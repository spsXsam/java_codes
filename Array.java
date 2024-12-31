import java.sql.SQLOutput;

public class Array {
    public static void main(String[] args){
        // array = used to store multiple values in a single variable
        // elements = things in an array
        String[] cars = {"Desire","Alto","Punch"};
        cars[2] = "Tesla";
        int i = 0;
        while(i < cars.length) {
            System.out.println(cars[i]);
            i++;
        }
            //Additional way :-

            String[] phone = new String[3];
            phone[0] = "Redmi";
            phone[1] = "Samsung";
            phone[2] = "Asus";
            System.out.println(phone[1]);;


    }
}
