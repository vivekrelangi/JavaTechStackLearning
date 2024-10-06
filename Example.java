package Errors;

public class Example {

    public static void f(){
        f();
    }

    public static void main(String[] args) {
        f();//Gives StackOverflowError
    }
}
