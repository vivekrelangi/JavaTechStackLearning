package Looping;

public class DoWhileLoop {
    public static void main(String[] args) {
        int num=123,res=0;
        do {
            int d = num % 10;
            res = res * 10 + d;
            num /= 10;
        }while(num > 0);
        System.out.println(res);
    }
}