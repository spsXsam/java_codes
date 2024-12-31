import java.util.ArrayList;
public class ForEach {
    public static void main(String[] args){
        // for each = traversing technique to iterate through the elements in an array/collection
        //             less steps, more readable
        //            less flexible
        // the colon ":" in for loop means in
        // for each loop also known as enhanced for loop

        //String[] animals = {"cat","dog","platypus","kangaroo"};
        ArrayList<String> animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("platypus");
        animals.add("kangaroo");

        for(String i :animals){
            System.out.println(i);
        }
    }
}
