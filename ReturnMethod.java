public class ReturnMethod {
    public static void main(String [] args){
        int x = 10;
        int y = 21;
        //int z = add(x,y);
        //System.out.println(z);
        System.out.println(add(x,y));
    }
    // if we are returning something we need to change the 'void' keyword to
    // the specific data type we are returning
    // For ex.  static void main() to (if for integers) static int variable();
    static int add(int x, int y){
        //int z = x + y;
        //return z ;
        return x + y;
    }
}
