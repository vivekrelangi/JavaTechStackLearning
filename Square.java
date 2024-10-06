package Inheritance;

import OOPS.Shapes;

public class Square extends Shapes {//Shapes class was actually moved from Inheritance package to OOPS package to demonstrate the use of protected keyword
    public Square(int side){
        super(side);
    }

    @Override
    public double getArea(){
        return length*length;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("I am a Square also");
    }
}
