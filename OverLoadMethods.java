public class OverLoadMethods {
    public static void main(String[] args) {
        // overload methods = methods or function that share the same name but have different parameters
        //                    method name + parameter = method signature
       double x = add(399999.0,1.0,3.56,909090.0);
        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("This is OverLoadMethod #1");
        return a + b;
    }
    static int add(int a, int b,int c) {
        System.out.println("This is OverLoadMethod #2");
        return a + b + c;
    }
    static int add(int a, int b, int c ,int d){
        System.out.println("This is OverLoadMethod #3");
        return a + b + c + d;
    }
    static double add(double a, double b) {
        System.out.println("This is OverLoadMethod #4");
        return a + b;
    }
    static double add(double a, double b,double c) {
        System.out.println("This is OverLoadMethod #5");
        return a + b + c;
    }
    static double add(double a, double b, double c ,double d){
        System.out.println("This is OverLoadMethod #6");
        return a + b + c + d;
    }

}
