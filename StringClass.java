public class StringClass {
    public static void main(String[] args){
        // if we use only .equals it will check the exact spelling including upper and lowe cases
        // if we use .equalsIgnoreCase it will overlook the upper and lower cases
        String name = "Samar";
        //boolean result = name.equalsIgnoreCase("samar");
        //int result = name.length();
        //char result = name.charAt(2);
        //int result = name.indexOf("m");
        //boolean  result = name.isEmpty();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace('a','o');
        System.out.println(result);;
    }
}
