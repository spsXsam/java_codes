public class PrintF {
    public static void main(String[] args){
        //printf() = an optional method to control, format, and display text to console window
        //           two arguments = format string + (object/variable/value)
        //           % [flags] [precision [width] [conversion - character]

        boolean Samosa = true;
        char Pasta = '#';
        String Sandwich = "Burger";
        int Pizza = 2;
        double Aloo = 2234567890.2234567890;
        //{conversion - character}
        /*System.out.printf("%b",Samosa);
        System.out.printf("%c", Pasta);
        System.out.printf("%s",Sandwich);
        System.out.printf("%d",Pizza);
        System.out.printf("%f",Aloo);*/

        //[width]
        // minimum number of character to be displayed as output
        //System.out.printf("Fantastic%10s",Sandwich);

        //[precision]
        //set the exact number of decimal number to be printed out while executing the program
        //System.out.printf("You have this much money % .2f ",Aloo);

        //[flags]
        // adds an effect to the output specified in the format specifier
        // - : left justify
        // + : output a plus(+) or minus(-) sign for a specific numeric value
        // 0 : numeric values are zero - padded
        // , : comma grouping separators if number > 100
        System.out.printf("You have this much money %,f",Aloo);
    }
}
