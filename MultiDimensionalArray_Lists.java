import java.util.*;
public class MultiDimensionalArray_Lists {
    public static void main(String[] args){
        // 2d ArrayList = a dynamic lists of lists
        // You can change the size of list during runtime

        ArrayList<ArrayList<String>> Ritul = new ArrayList();

        ArrayList<String> grocery = new ArrayList();
        grocery.add("Pasta");
        grocery.add("CornFlakes");
        grocery.add("Wafers");

        ArrayList<String> vegetables = new ArrayList();
        vegetables.add("Tomatoes");
        vegetables.add("Potatoes");
        vegetables.add("Peas");

        ArrayList<String> games = new ArrayList();
        games.add("Assassins Creed");
        games.add("Valorant");
        games.add("Ghost of Tsushima");

        Ritul.add(grocery);
        Ritul.add(vegetables);
        Ritul.add(games);

        /*System.out.println(grocery);
        System.out.println(vegetables);
        System.out.println(games);*/

        System.out.println(Ritul.get(2).get(1));
    }
}
