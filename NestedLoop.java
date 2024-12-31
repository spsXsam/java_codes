import java.util.Scanner;
public class NestedLoop{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rows;
        int columns;
        String sym;
        System.out.println("Enter the number of rows : ");
        rows = in.nextInt();
        System.out.println("Enter the number of columns : ");
        columns = in.nextInt();
        System.out.println("Enter the sign to be used : ");
        sym = in.next();

        for(int i = 1; i <=rows; i ++){
            System.out.println();
            for(int j = 1; j <=columns; j ++ ){
                System.out.print(sym);
            }


        }
    }
}