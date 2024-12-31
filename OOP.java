public class OOP {
    public static void main(String[] args){
        // object = an instance of a class that may contain attribute(properties of object) or method(actions of object)
        // example = (Valorant,Temple Run,Ghost Runner,Hogwarts Legacy)

        car myCar1 = new car();    // now the variable myCar has the attributes defined in the car class
        car myCar2 = new car();

        System.out.println(myCar1.year);
        System.out.println(myCar1.model);

        System.out.println(myCar2.model);
        System.out.println(myCar2.make);



        /*System.out.println(myCar1.color);
        System.out.println(myCar1.year);
        System.out.println(myCar1.price);*/

        /*myCar1.drive();
        myCar1.brake();*/
    }
}
