public class MultiDimensionalArray {
    public static void main(String[] args){
        // 2d array or MultiDimensionalArray = an array of arrays
        // For a 2d array we need two sets of [] brackets i.e. [][]
        // We can understand 2d arrays as a table of row and columns where the first
        // [] represent row and second [] represent columns
        // For the table it is like this:-
        //       0         1         2
        // 0   Desire   Mustang    Sian                // for this specific program
        // 1   Punch    Ferrari    Ranger
        // 2   Alto     Bugatti    SVJ
        String [][] cars = {{"Desire","Mustang","Sian"}
                           ,{"Punch","Ferrari","Ranger"}
                           ,{"Alto","Bugatti","SVJ"}};
        /*cars[0][0] = "Desire";
        cars[1][0] = "Punch";
        cars[2][0] = "Alto";
        cars[0][1] = "Mustang";
        cars[0][2] = "Sian";
        cars[1][1] = "Ferrari";
        cars[2][1] = "Bugatti";
        cars[1][2] = "Ranger";
        cars[2][2] = "SVJ";

         */

        for(int i = 0; i < cars.length;i ++){
            System.out.println();
            for(int j = 0; j < cars[i].length; j ++) {
                System.out.print(cars[i][j] + " ");
            }
        }


    }
}
