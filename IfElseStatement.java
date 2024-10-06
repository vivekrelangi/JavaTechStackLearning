package Branching;

public class IfElseStatement {
    public static void main(String[] args) {
        int a=10;

        if(a > 10) {
            System.out.println("a is greater than 10");
        }

        else {
            System.out.println("a is less than or eqaul to 10 ");
            if(a < 10){
                System.out.println("a is less than 10");
            }
            else {
                System.out.println("a is equal to 10");
            }
        }
    }
}
