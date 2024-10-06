package Polymorphism;

class Shape{
    public void getArea(){
        System.out.println("I am an empty shape");
    }
}

class Square extends Shape{
    int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public void getArea(){
        System.out.println("I am a square and my area is: "+(side*side));
    }
}

class Rectangle extends Shape{
    int length,width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea(){
        System.out.println("I am a rectangle and my area is: "+(length*width));
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Shape[] arr = new Shape[3];
        //case1
        Shape s1 = new Shape();
        s1.getArea();

        //case2
        s1  = new Square(4);
        s1.getArea();

        //case3
        s1 = new Rectangle(3,5);
        s1.getArea();

        arr[0] = new Shape();
        arr[2] = new Square(77);
        arr[1] = new Rectangle(4,7);

        for (Shape s:arr){
            s.getArea();
        }
    }
}
