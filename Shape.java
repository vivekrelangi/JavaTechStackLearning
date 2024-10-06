package Abstraction.AbstractClasses;

public abstract class Shape {
    public abstract void getPerimeter();
    public abstract void getArea();

    public void display(){
        System.out.println("I am a shape.");
    }
}
