public class WrapperClasses {
    public static void main(String[] args){
        // wrapper classes = provides a way to use primitive data types as reference
        // data types. Reference data types contain useful methods which can be used
        // with collection . Example of collection - ArrayList.

        // primitive       wrapper
        // ---------       -------
        // boolean         Boolean
        //   int           Integer
        //  char           Character
        // double          Double

        //autoboxing = automatic conversion that the java compiler makes between
        //             primitive data types to their corresponding object wrapper
        //             classes
        //unboxing = the reverse of autoboxing. Conversion from reference class to
        //           primitive

        // reference or wrapper class variable always start with capital letters

        Boolean a = true;
        Character b = '@';
        Integer c = 121;
        Double d = 3.14;
        String e = "Samosa";

        if(e.equals("Samosa"))
        {
            System.out.println("This is true");
        }
        else {
            System.out.println("This is false");

        }


    }
}
