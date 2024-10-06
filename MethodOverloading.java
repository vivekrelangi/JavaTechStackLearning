package Polymorphism;

public class MethodOverloading {

    public double getArea(int side){
        return side*side;
    }

    public double getArea(int length, int width){
        return length*width;
    }

    public double getArea(double radius){
        return 3.14*radius*radius;
    }

    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();

        System.out.println("Area of square:"+obj.getArea(4));
        System.out.println("Area of rectangle:"+obj.getArea(3,5));
        System.out.println("Area of circle:"+obj.getArea(2.7));
    }
}
