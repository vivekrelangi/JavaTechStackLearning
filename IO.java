package Basics;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an integer:");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println(a+" is even");
        }else {
            System.out.println(a+" is odd");
        }
    }
}
