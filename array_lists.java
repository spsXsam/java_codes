import java.util.ArrayList;
public class array_lists {
    public static void main(String[] args){
        // ArrayList = a resizeable Array
        //               elements can be added or removed after the compilation stage
        //               stores only reference data types

        ArrayList<String> food = new ArrayList<String>();
        food.add("Samosa");
        food.add("Momo");
        food.add("Burger");

        /*food.set(1,"Chat");
        food.remove(2);
        food.clear();*/

        /*for(int i = 0;i < food.size();i++){
            System.out.println(food.get(i));
        }*/
        System.out.println(food.get(2));
    }
}
