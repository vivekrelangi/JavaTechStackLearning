package OOPS;

public /*final*/ class Shapes {
    protected int length;//This class was actually moved from Inheritance package to demonstrate the use of protected keyword

    public Shapes(int length){
        this.length = length;
    }

    public double getArea(){
        return 0;
    }

    public /*final*/ void display(){
        System.out.println("I am a shape.");
    }
}
