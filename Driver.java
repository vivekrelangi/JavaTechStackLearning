package Inheritance;

public class Driver {
    //This class does not represent car driver instead it represents driver code.
    public static void main(String[] args){
//        Car c = new Car();
//
//        c.setColor("blue");
//
//        SUV s1 = new SUV();
//
//        s1.setName("My Car");
        //Vehicle v1 = new Car();
        Square s1 = new Square(4);
        //Shapes s2 = new Square(7);

        System.out.println(s1.getArea());
        s1.display();
    }
}
